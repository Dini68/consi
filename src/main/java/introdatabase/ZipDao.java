package introdatabase;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ZipDao {

    private DataSource dataSource = new MariaDbDataSource();

    public ZipDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertZipcodes(List<String> zips) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("INSERT INTO zip (zip, city, citypart) VALUES (?,?,?)")) {
            insertRecordsToDB(zips, stmt);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

    private void insertRecordsToDB(List<String> zips, PreparedStatement stmt) throws SQLException {
        for (String s: zips) {
            stmt.setString(1, s.split(";")[0]);
            stmt.setString(2, s.split(";")[1].trim());
            if (s.split(";").length > 2) {
                stmt.setString(3, s.split(";")[2]);
            }
            else {
                stmt.setString(3, null);
            }
            stmt.executeUpdate();
        }
    }

    public List<String>  getCitiesByPrefix(String prefix) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM zip WHERE city LIKE ?");
        ) {
//           prefix = "%"+prefix+"%";
           ps.setString(1, prefix);
            try (ResultSet rs = ps.executeQuery()) {
                List<String> cities = new ArrayList<>();
                while (rs.next()) {
                    String city = rs.getString("city");
                    String zip = rs.getString("zip");
                    cities.add(city + " " + zip);
                }
                return cities;
            }
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select cities", se);
        }
    }

    public List<String>  getCitiesByZip(String zip) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM zip WHERE zip= ?");
        ) {
            ps.setString(1, zip);
            try (ResultSet rs = ps.executeQuery()) {
                return getCities(zip, rs);
            }
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select orszagok", se);
        }
    }

    private List<String> getCities(String zip, ResultSet rs) throws SQLException {
        List<String> cities = new ArrayList<>();
        while (rs.next()) {
            String part = rs.getString("citypart");
            if (part == null) {
                cities.add(zip + " " + rs.getString("city"));
            }
            else {
                cities.add(zip + " " + rs.getString("city") + " " + part);
            }
        }
        if (cities.size() == 0) {
            cities.add("Nincs ilyen irányítószám!");
        }
        return cities;
    }


}
