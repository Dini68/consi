package song;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SongDaoTest {
    SongDao songDao;

    @BeforeEach
    public void init() {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/songs?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (
                SQLException sqlException) {
            throw new IllegalStateException("Cannot connect!", sqlException);
        }
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        songDao = new SongDao(dataSource);

    }

    @Test
    public void insertSongTest() {
        Track track1 = songDao.insertSong(new Track("Bikini", "Közeli helyeken", 3.54));
        Track track2 = songDao.insertSong(new Track("Bikini", "Fagyi", 5.24));
        Track track3 = songDao.insertSong(new Track("Bikini", "Itt ül az idő", 4.54));

        assertEquals(track1.getBand(), "Bikini");
        assertEquals(track2.getTitle(), "Fagyi");
        assertEquals(track3.getLength(), 4.54);
    }
    @Test
    public void getIdInsertSongTest() {
        Track track1 = songDao.insertSong(new Track("Bikini", "Közeli helyeken", 3.54));
        Track track2 = songDao.insertSong(new Track("Bikini", "Fagyi", 5.24));
        Track track3 = songDao.insertSong(new Track("Bikini", "Itt ül az idő", 4.54));

        assertEquals(track1.getId(), 1);
        assertEquals(track2.getId(), 2);
        assertEquals(track3.getId(), 3);
    }
    @Test
    public void listSongAllTest() {
        Track track1 = songDao.insertSong(new Track("Bikini", "Közeli helyeken", 3.54));
        Track track2 = songDao.insertSong(new Track("Bikini", "Fagyi", 5.24));
        Track track3 = songDao.insertSong(new Track("Bikini", "Itt ül az idő", 4.54));

        assertEquals(3, songDao.listSongAll().size());
    }
    @Test
    public void deleteSongByIdTest() {
        Track track1 = songDao.insertSong(new Track("Bikini", "Közeli helyeken", 3.54));
        Track track2 = songDao.insertSong(new Track("Bikini", "Fagyi", 5.24));
        Track track3 = songDao.insertSong(new Track("Bikini", "Itt ül az idő", 4.54));

        assertEquals(3, songDao.listSongAll().size());

        songDao.deleteSongById(2);

        assertEquals(2, songDao.listSongAll().size());
    }
    @Test
    public void updateSongByLengthTest() {
        Track track1 = songDao.insertSong(new Track("Bikini", "Közeli helyeken", 3.54));
        Track track2 = songDao.insertSong(new Track("Bikini", "Fagyi", 5.24));
        Track track3 = songDao.insertSong(new Track("Bikini", "Itt ül az idő", 4.54));

        assertEquals(4.54, track3.getLength());
//        songDao.updateSongLengthById(1, 7.5);
//        songDao.updateSongLengthById(2, 7.5);
        songDao.updateSongLengthById(3, 7.5);

        assertEquals(7.5, songDao.listSongAll().get(2).getLength());

    }
    @Test
    public void bandByTitleTest() {
        Track track1 = songDao.insertSong(new Track("Bikini", "Közeli helyeken", 3.54));
        Track track2 = songDao.insertSong(new Track("Bikini", "Fagyi", 5.24));
        Track track3 = songDao.insertSong(new Track("Bikini", "Itt ül az idő", 4.54));


        assertEquals("Bikini Fagyi", songDao.bandByTitle("Fagyi"));
    }

}