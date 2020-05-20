package org.afpa.models;

import org.afpa.controllers.JDBC.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Supplier {
    private final java.sql.Connection connection = new Connection().getConnection("papyrus");

    public Supplier() {}

    public ResultSet supplierByCode(int code) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM fournis WHERE numfou = ?");

        stmt.setInt(1, code);

        return stmt.executeQuery();
    }
}
