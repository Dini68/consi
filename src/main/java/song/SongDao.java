package song;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SongDao {

    private DataSource dataSource = new MariaDbDataSource();

    public SongDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Track insertSong(Track track) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into songs(band, title, length) values (?,?,?)",
                                Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, track.getBand());
            stmt.setString(2, track.getTitle());
            stmt.setDouble(3, track.getLength());
            stmt.executeUpdate();
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    long id = rs.getLong("id");
                    return new Track(id, track.getBand(), track.getTitle(), track.getLength());
                }
            }
            throw new IllegalArgumentException("Can not generated id");
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }


    public void deleteSongById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("delete from songs where id = ?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot delete", se);
        }
    }

    public void updateSongLengthById(long id, double length) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("update songs set length = ? where id = ?")) {
            stmt.setDouble(1, length);
            stmt.setLong(2, id);
            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot update", se);
        }
    }

    public List<String> listSongOrderByBand() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select band from songs order by band")
        ) {
            List<String> bands = new ArrayList<>();
            while (rs.next()) {
                String band = rs.getString("band");
                bands.add(band);
            }
            return bands;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select songs", se);
        }
    }

    public List<String> listSongOrderByTitle() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select title from songs order by title")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("title");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select songs", se);
        }
    }

    public List<Track> listSongAll() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from songs order by id")
        ) {
            List<Track> names = new ArrayList<>();
            while (rs.next()) {
                long id = rs.getLong("id");
                String band = rs.getString("band");
                String title = rs.getString("title");
                double length = rs.getDouble("length");
                names.add(new Track(id, band, title, length));
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select songs", se);
        }
    }

    public List<String> listSongOrderByLength() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select length from songs order by length")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("length");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select songs", se);
        }
    }

    public String bandByTitle(String title) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select band from songs where title = ?");
        ) {
            ps.setString(1, title);
            try (ResultSet rs = ps.executeQuery()) {
                String band = "";
                while (rs.next()) {
                    band = rs.getString("band");
                }
                return band + " " + title;
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select songs", se);
        }
    }

    public void createSongsWithRoll(List<String> bands) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try (PreparedStatement stmt = conn.prepareStatement("insert into songs(band, title, length) values (?,?,?)")) {
                stmt.setString(2, "számcím");
                stmt.setDouble(3, 11);
                for (String band : bands) {
                    if (band.startsWith("x")) {
                        throw new IllegalArgumentException("Invalid band");
                    }
                    stmt.setString(1, band);
                    stmt.executeUpdate();
                }
                conn.commit();
            } catch (IllegalArgumentException iae) {
                conn.rollback();
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot insert", sqlException);
        }
    }


}
