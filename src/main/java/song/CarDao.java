package song;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

    private DataSource dataSource = new MariaDbDataSource();

    public CarDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertData(String name){
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into employees(emp_name) values (?)")) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }

    }


    public String selectNameById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select emp_name from employees where id = ?");
        ) {
            stmt.setLong(1, id);
            try (
                    ResultSet rs = stmt.executeQuery();
            ) {
                if (rs.next()) {
                    String name = rs.getString("emp_name");
                    return name;
                }
                throw new IllegalArgumentException("No result");
            } catch (SQLException sql) {
                throw new IllegalArgumentException("Error by insert", sql);
            }

        } catch (SQLException sql) {
            throw new IllegalArgumentException("Error by insert", sql);
        }
    }

    public List<String> listEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees order by emp_name")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }

    public long insertCarGetId (Car car) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into cars (car_name, car_price) values (?,?)",
                     Statement.RETURN_GENERATED_KEYS)
        ) {

            stmt.setString(1, car.getName());
            stmt.setLong(2, car.getPrice());
            stmt.executeUpdate();
            return executeAndGetGeneratedKey(stmt);
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }
    private long executeAndGetGeneratedKey(PreparedStatement stmt) {
        try (
                ResultSet rs = stmt.getGeneratedKeys();
        ) {
            if (rs.next()) {
                return rs.getLong(1);
            } else {
                throw new SQLException("No key has generated");
            }
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }
}
