package org.afpa.models;

import org.afpa.controllers.JDBC.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Supplier {
    private final java.sql.Connection connection = new Connection().getConnection("papyrus");

    public Supplier() {
    }

    public int addSupplier(String nomfou, String ruefou, String posfou, String vilfou, String confou) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO fournis(nomfou, ruefou, posfou, vilfou, confou, numfou) VALUES (?, ?, ?, ?, ?, ?)");

        stmt.setString(1, nomfou);
        stmt.setString(2, ruefou);
        stmt.setString(3, posfou);
        stmt.setString(4, vilfou);
        stmt.setString(5, confou);
        stmt.setInt(6, this.getMaxNumFou() + 1);

        return stmt.executeUpdate();
    }

    /**
     * Returns all the suppliers
     *
     * @return All the suppliers
     * @throws SQLException On database error
     */
    public ResultSet allSuppliers() throws SQLException {
        return this.connection.createStatement().executeQuery("SELECT * FROM fournis ORDER BY nomfou");
    }

    public int getMaxNumFou() throws SQLException {
        ResultSet rs = this.connection.createStatement().executeQuery("SELECT MAX(numfou) as max FROM fournis");
        return rs.next() ? rs.getInt("max") : 0;
    }

    /**
     * Returns the order details based on the given supplier
     *
     * @param supplier The supplier to get the order details from
     * @return The order details frmo the given supplier
     * @throws SQLException On database error
     */
    public ResultSet orderDetailsBySupplier(String supplier) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM entcom JOIN fournis ON entcom.numfou = fournis.numfou WHERE fournis.nomfou = ?");

        stmt.setString(1, supplier);

        return stmt.executeQuery();
    }

    /**
     * Returns the supplier based on the given code
     *
     * @param code The code of the supplier
     * @return The supplier based on the given code
     * @throws SQLException On database error
     */
    public ResultSet supplierByCode(int code) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM fournis WHERE numfou = ?");

        stmt.setInt(1, code);

        return stmt.executeQuery();
    }
}
