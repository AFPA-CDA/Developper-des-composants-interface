package org.afpa.controllers.JDBC;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import org.afpa.models.Supplier;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddSupplier implements Initializable {

    @FXML
    private TextField name, address, postalCode, contact, city;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String isValidString = "^(\\s|\\w|\\d)*?$";
        String isValidPostalCode = "^\\d{0,5}$";

        this.setTextFormatter(this.name, isValidString);
        this.setTextFormatter(this.address, isValidString);
        this.setTextFormatter(this.contact, isValidString);
        this.setTextFormatter(this.city, isValidString);
        this.setTextFormatter(this.postalCode, isValidPostalCode);
    }

    @FXML
    private void add() throws SQLException {
        String nameText = this.name.getText();
        String addressText = this.address.getText();
        String postalCodeText = this.postalCode.getText();
        String contactText = this.contact.getText();
        String cityText = this.city.getText();

        Supplier supplier = new Supplier();
        int isAdded = supplier.addSupplier(nameText, addressText, postalCodeText, cityText, contactText);

        if (isAdded != 0) {
            this.alert(Alert.AlertType.INFORMATION, "Le fournisseur à été ajouté.", "Ajout du fournisseur.");
            this.abort();
        } else {
            this.alert(Alert.AlertType.ERROR, "Une erreur est survenue lors de l'ajout.", "Erreur lors de l'ajout.");
        }
    }

    @FXML
    private void abort() {
        this.name.setText("");
        this.address.setText("");
        this.postalCode.setText("");
        this.contact.setText("");
        this.city.setText("");
    }

    private void alert(Alert.AlertType alertType, String content, String header) {
        Alert alert = new Alert(alertType);
        alert.setTitle("AddSupplier");
        alert.setContentText(content);
        alert.setHeaderText(header);
        alert.showAndWait();
    }

    /**
     * Sets the text formatter on the given textField
     *
     * @param textField The textField to put the text formatter on
     * @param matcher   The regex to use
     */
    private void setTextFormatter(TextField textField, String matcher) {
        textField.setTextFormatter(new TextFormatter<>(change ->
                change.getControlNewText().matches(matcher) ? change : null
        ));
    }
}
