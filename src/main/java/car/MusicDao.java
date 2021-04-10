package car;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;

public class MusicDao {
    
    private DataSource dataSource = new MariaDbDataSource();

    public MusicDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
