package introdatabase;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

public class CitiesMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/orszagok?useUnicode=true");
            dataSource.setUser("orszagok");
            dataSource.setPassword("orszagok");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        CitiesDao cd = new CitiesDao(dataSource);

        int i = 0;
        for (String s: cd.selectCityByArea()) {
            i ++;
            System.out.println(i + ". " + s);
        }
        System.out.println();
        i = 0;
        for (String s: cd.selectCityByGDP()) {
            i ++;
            System.out.println(i + ". " + s);
        }
        System.out.println();
        i = 0;
        for (String s: cd.selectCityByPopulation()) {
            i ++;
            System.out.println(i + ". " + s);
        }
        i = 0;
        for (String s: cd.selectCountryByPopulationMoreThan(500000)) {
            i ++;
            System.out.println(i + ". " + s);
        }
    }

}
