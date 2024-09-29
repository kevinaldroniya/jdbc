package org.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionUtil {

    /**
     * The HikariCP data source.
     * HikariCP is for managing the connection pool.
     */
    private static final HikariDataSource dataSource;
    private static final byte MAXIMUM_POOL_SIZE = 10;
    private static final byte MINIMUM_IDLE = 5;
    private static final long IDLE_TIMEOUT = 60000;

    /*
        * The static block is used to initialize the HikariCP data source.
        * The static block is executed when the class is loaded into the JVM.
     */
    static {
        /*
         * The HikariConfig object is created and the configuration is set.
         * The configuration includes the driver class name, JDBC URL, username, and password.
         * The maximum pool size, minimum idle connections, idle timeout, and max lifetime are also set.
         */
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc_impl_example");
        config.setUsername("root");
        config.setPassword("root123");

        config.setMaximumPoolSize(MAXIMUM_POOL_SIZE);
        config.setMinimumIdle(MINIMUM_IDLE);
        config.setIdleTimeout(IDLE_TIMEOUT);
        config.setMaxLifetime(10 * IDLE_TIMEOUT);

        /*
         * The HikariDataSource object is created with the HikariConfig object.
         * The HikariDataSource object is used to get the connection from the connection pool.
         */
        dataSource = new HikariDataSource(config);
    }

    /**
     * Returns the connection object.
     * @return the connection object
     */
    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}
