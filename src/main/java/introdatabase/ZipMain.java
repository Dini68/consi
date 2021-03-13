package introdatabase;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZipMain {

    public List<String> readLines(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        try {
            String line ;
            if ((line = reader.readLine()) != null) {}

            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
                result.add(line);
            }
            return result;
        } catch (IOException ioException) {
            throw new IllegalStateException("not read file", ioException);
        }
    }


    public static void main(String[] args) throws IOException {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/zip?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        List<String> zipcodes = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(Path.of("iranyitoszamok.csv"))){
            zipcodes = new ZipMain().readLines(br);
        }

        ZipDao zd = new ZipDao(dataSource);

//        zd.insertZipcodes(zipcodes);

        System.out.println(zd.getCitiesByZip("9982"));
        System.out.println(zd.getCitiesByZip("2243"));
        System.out.println(zd.getCitiesByZip("1098"));
        System.out.println(zd.getCitiesByZip("1099"));

        Scanner scanner = new Scanner(System.in);

        String prefix;
        do {
            System.out.println("What's prefix?");
            prefix = scanner.nextLine();
            List<String> result = zd.getCitiesByPrefix(prefix);
            System.out.println(result.size() + " " + result);
        } while (!prefix.equals("0"));
    }
}
