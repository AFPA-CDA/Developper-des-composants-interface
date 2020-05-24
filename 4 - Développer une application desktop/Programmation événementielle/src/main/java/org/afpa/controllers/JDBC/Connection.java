package org.afpa.controllers.JDBC;

import java.sql.DriverManager;

public class Connection {
    private static final String user = "root";
    private static final String password = "10495";

    /**
     * Gets the connection from the given database
     *
     * @param database The database name to connect to.
     * @return The connection to the database.
     */
    public java.sql.Connection getConnection(String database) {
        try {
            String url = String.format("jdbc:mysql://localhost:3306/%s?serverTimezone=UTC", database);
            return DriverManager.getConnection(url, Connection.user, Connection.password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
