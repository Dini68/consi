package introdatabase;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CitiesDao {

    private DataSource dataSource;

    public CitiesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> selectCityByArea() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT orszag, terulet FROM orszagok ORDER BY terulet DESC LIMIT 10")){

//            ps.setString(1, zip);
            try (ResultSet rs = ps.executeQuery()) {
                List<String> cities = new ArrayList<>();
                String country = "";
                String area = "";
                while (rs.next()) {
                    country = rs.getString("orszag");
                    area = rs.getString("terulet");
                    cities.add(country + " " + area);
                }
                return cities;
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }
    public List<String> selectCityByGDP() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT orszag, GDP FROM orszagok ORDER BY GDP DESC LIMIT 10")){

//            ps.setString(1, zip);
            try (ResultSet rs = ps.executeQuery()) {
                List<String> cities = new ArrayList<>();
                String country = "";
                String gdp = "";
                while (rs.next()) {
                    country = rs.getString("orszag");
                    gdp = rs.getString("GDP");
                    cities.add(country + " " + gdp);
                }
                return cities;
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }

    public List<String> selectCityByPopulation() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT orszag, nepesseg FROM orszagok ORDER BY nepesseg DESC LIMIT 10")){

//            ps.setString(1, zip);
            try (ResultSet rs = ps.executeQuery()) {
                List<String> cities = new ArrayList<>();
                String country = "";
                String pop = "";
                while (rs.next()) {
                    country = rs.getString("orszag");
                    pop = rs.getString("nepesseg");
                    cities.add(country + " " + pop);
                }
                return cities;
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }
    public List<String> selectCountryByPopulationMoreThan(long population) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT orszag, nepesseg FROM orszagok WHERE nepesseg > ? ORDER BY nepesseg DESC LIMIT 10")){

            ps.setLong(1, population);
            try (ResultSet rs = ps.executeQuery()) {
                List<String> cities = new ArrayList<>();
                String country = "";
                String pop = "";
                while (rs.next()) {
                    country = rs.getString("orszag");
                    pop = rs.getString("nepesseg");
                    cities.add(country + " " + pop);
                }
                return cities;
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }

}

