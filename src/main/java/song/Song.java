package song;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Scanner;

public class Song {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Song song = new Song();

        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/songs?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        SongDao sd = new SongDao(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
//        song.requestDataAndInsert(sd);
//
        song.insertFixDate(sd);
//
//        song.deleteSongById(sd);

        sd.updateSongLengthById(3, 7.5);
//        song.updateSongLengthById(sd);

//          sd.createSongsWithRoll(List.of("Kft", "Piramis", "factor"));

        System.out.println(sd.listSongAll());

        System.out.println(sd.listSongOrderByBand());
        System.out.println(sd.listSongOrderByTitle());
        System.out.println(sd.listSongOrderByLength());
        System.out.println(sd.bandByTitle("Itt ül az idő"));
    }

    public void updateSongLengthById(SongDao sd) {
        boolean error = true;
        long id = 0;
        do {
            System.out.println("Kérem a mósosítani kivánt dal azonosítóját: ");
            String line = scanner.nextLine();
            try {
                id = Integer.parseInt(line);
                error = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Error! This not number '" + line + "'");
            }
        } while (error);

        error = true;
        double length = 0;
        do {
            System.out.println("Kérem a dal hosszát: ");
            String line = scanner.nextLine();
            try {
                length = Double.parseDouble(line);
                error = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Error! This not number '" + line + "'");
            }
        } while (error);
        sd.updateSongLengthById(id, length);
    }

    public void deleteSongById(SongDao sd) {
        boolean error = true;
        long id = 0;
        do {
            System.out.println("Kérem a törölni kivánt dal azonosítóját: ");
            String line = scanner.nextLine();
            try {
                id = Integer.parseInt(line);
                error = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Error! This not number '" + line + "'");
            }
        } while (error);
        sd.deleteSongById(id);
    }

    public void insertFixDate(SongDao sd) {
        sd.insertSong(new Track("Bikini", "Közeli helyeken", 3.54));
        sd.insertSong(new Track("Bikini", "Fagyi", 5.24));
        sd.insertSong(new Track("Bikini", "Itt ül az idő", 4.54));
    }

    public void requestDataAndInsert(SongDao sd) {
        String band;
        do {
            System.out.println("Kérem az előadót");
            band = scanner.nextLine();
            if (band.isBlank()) {
                System.out.println("Hiba, nincs megadva előadó!");
            }
        } while (band.isBlank());

        String title;
        do {
            System.out.println("Kérem a címet");
            title = scanner.nextLine();
            if (title.isBlank()) {
                System.out.println("Hiba, nincs megadva a dal címe!");
            }
        } while (title.isBlank());

        boolean error = true;
        double length = 0;
        do {
            System.out.println("Kérem a hosszát");
            String line = scanner.nextLine();
            try {
                length = Double.parseDouble(line);
                if (length < 0.1 || length > 20) {
                    System.out.println("age must be between '0.1 .. 20' ");
                }
                error = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Error! This not number '" + line + "'");
            }
        } while (error);


        System.out.println(sd.insertSong(new Track(band, title, length)));
    }

}
