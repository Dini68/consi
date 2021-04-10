package car;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.SQLException;
import java.util.Scanner;

public class MusicMain {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        MusicDao md = new MusicDao(dataSource);
    }
}
