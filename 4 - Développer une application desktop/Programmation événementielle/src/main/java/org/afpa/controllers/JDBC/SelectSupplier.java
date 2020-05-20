package org.afpa.controllers.JDBC;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.afpa.models.Supplier;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SelectSupplier implements Initializable {
    @FXML
    private TextField supplier, name, address, postalCode, contact, city;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    @FXML
    private void search() throws SQLException {
        try {
            ResultSet result = new Supplier().supplierByCode(Integer.parseInt(this.supplier.getText()));

            if (result.next()) {
                this.name.setText(result.getString("nomfou"));
                this.contact.setText(result.getString("confou"));
                this.address.setText(result.getString("ruefou"));
                this.city.setText(result.getString("vilfou"));
                this.postalCode.setText(result.getString("posfou"));
            } else {
                this.supplier.setText("404: Supplier not found");
            }

            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
