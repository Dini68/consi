package introdatabase;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDao {

    private DataSource dataSource = new MariaDbDataSource();

    public CountryDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> selectAll() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM orszagok")){

//            ps.setString(1, zip);
            try (ResultSet rs = ps.executeQuery()) {
                List<String> countries = new ArrayList<>();
                String country = "";
                String area = "";
                while (rs.next()) {
                    country = rs.getString("orszag");
                    area = rs.getString("terulet");
                    countries.add(country + " " + area);
                }
                return countries;
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }
    public List<String> listCountryNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select orszag from orszagok order by orszag")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("orszag");
                names.add(name);
            }
            return names;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select orszagok", se);
        }
    }

    public String getCapital() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select orszag, fovaros from orszagok where orszag = 'Magyarország'")
        ) {
            String name = "";
            if (rs.next()) {
                name = rs.getString("fovaros");
            }
            return name;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select orszagok", se);
        }
    }
//    public List<Activity> selectByType(ActivityType type) {
//        try(Connection conn = dataSource.getConnection();
//            PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")){
//            stmt.setString(1, type.toString());
//            return selectActivityByPreparedStatement(stmt);
//        } catch (SQLException sqlException) {
//            throw new IllegalStateException("Cannot connect", sqlException);
//        }
//    }
//    private List<Activity> selectActivityByPreparedStatement(PreparedStatement stmt){
//        List<Activity> result = new ArrayList<>();
//        try (ResultSet rs = stmt.executeQuery())
//        {
//            while (rs.next()) {
//                Activity activity = new Activity(
//                        rs.getLong("id"),
//                        rs.getTimestamp("start_time").toLocalDateTime(),
//                        rs.getString("activity_desc"),
//                        ActivityType.valueOf(rs.getString("activity_type")));
//                result.add(activity);
//            }
//            return result;
//        }
//        catch (SQLException sqlException) {
//            throw new IllegalArgumentException("Wrong statement!",sqlException);
//        }
//    }
    public String capitalByCountry(String country) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select fovaros from orszagok where orszag = ?");
        ) {
            ps.setString(1, country);
            try (ResultSet rs = ps.executeQuery()) {
                String capital = "";
                while (rs.next()) {
                    capital = rs.getString("fovaros");
                }
                return country + " " + capital;
            }
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select orszagok", se);
        }
    }
    public String currencyByCountry(String country) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select penznem from orszagok where orszag = ?");
        ) {
            ps.setString(1, country);
            try (ResultSet rs = ps.executeQuery()) {
                String currency = "";
                while (rs.next()) {
                    currency = rs.getString("penznem");
                }
                return country + " " + currency;
            }
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select orszagok", se);
        }
    }

//    public String tset(String name) {
//        try (
//                Connection conn = dataSource.getConnection();
//                PreparedStatement stmt =
//                        conn.prepareStatement("select emp_name from employees where id = ?");
//        ) {
//            stmt.setLong(1, id);
//
//            // ...
//        } catch (SQLException sqle) {
//            throw new IllegalArgumentException("Error by insert", sqle);
//        }
//        try (
//                ResultSet rs = stmt.executeQuery();
//        ) {
//            if (rs.next()) {
//                String name = rs.getString("emp_name");
//                return name;
//            }
//            throw new IllegalArgumentException("No result");
//        } catch (SQLException sqle) {
//            throw new IllegalArgumentException("Error by insert", sqle);
//        }
//
//
//    }
}
