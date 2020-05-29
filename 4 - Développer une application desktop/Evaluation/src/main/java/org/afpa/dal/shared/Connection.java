package org.afpa.dal.shared;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Connection class used for the software
 */
public final class Connection {
    private final Properties info = new Properties();

    /**
     * @return The connection to the database
     * @throws SQLException An error if the database failed to connect
     */
    public java.sql.Connection getConnection() throws SQLException {
        java.sql.Connection connection = DriverManager.getConnection(info.getProperty("url"), info);

        connection.setAutoCommit(false);

        return connection;
    }

    /**
     * Sets the password
     *
     * @param password The password
     */
    public Connection setPassword(String password) {
        info.setProperty("password", password);
        return this;
    }

    /**
     * Sets the url
     *
     * @param url The url
     */
    public Connection setUrl(String url) {
        info.setProperty("url", url);
        return this;
    }

    /**
     * Sets the user
     *
     * @param user The user
     */
    public Connection setUser(String user) {
        info.setProperty("user", user);
        return this;
    }
}