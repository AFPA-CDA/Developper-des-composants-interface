package org.afpa.controllers.JDBC;

import java.sql.DriverManager;

public class Connection {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "10495";

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
