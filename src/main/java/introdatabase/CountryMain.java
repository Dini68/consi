package introdatabase;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

public class CountryMain {

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

        CountryDao cd = new CountryDao(dataSource);
        int i = 0;
        for (String s: cd.selectAll()){
            i++;
            System.out.println(i + ". " + s);
        }

        System.out.println();
        i = 0;
        for (String s: cd.listCountryNames()){
            i++;
            System.out.println(i + ". " + s);
        }

        System.out.println(cd.getCapital());
        System.out.println(cd.capitalByCountry("Magyarország"));
        System.out.println(cd.capitalByCountry("Kína"));

        System.out.println(cd.currencyByCountry("Kína"));
        System.out.println(cd.currencyByCountry("Franciaország"));
        System.out.println(cd.currencyByCountry("Nagy-Britannia"));
        System.out.println(cd.currencyByCountry("Kazahsztán"));
        System.out.println(cd.currencyByCountry("Oroszország"));
        System.out.println(cd.currencyByCountry("Amerikai Egyesült Államok"));
        System.out.println(cd.currencyByCountry("Svájc"));

    }
}
