package org.afpa.controllers.JDBC;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import org.afpa.models.Supplier;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SelectOrder implements Initializable {
    @FXML
    private ComboBox<String> choices;

    @FXML
    private TextArea resultText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            ResultSet result = new Supplier().allSuppliers();
            ObservableList<String> choicesList = FXCollections.observableArrayList();

            while (result.next()) {
                choicesList.add(result.getString("nomfou"));
            }

            this.choices.setItems(choicesList);

            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onAction() throws SQLException {
        String selectedSupplier = this.choices.getSelectionModel().getSelectedItem();

        ResultSet result = new Supplier().orderDetailsBySupplier(selectedSupplier);

        StringBuilder sb = new StringBuilder();

        while (result.next()) {
            sb.append(result.getInt("numcom"));
            sb.append(" ");
            sb.append(result.getDate("datcom"));
            sb.append(" ");
            sb.append(result.getString("obscom"));
            sb.append("\n");

            this.resultText.setText(sb.toString());
        }

        result.close();
    }
}
