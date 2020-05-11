package org.afpa.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.afpa.pojo.Client;

import java.net.URL;
import java.util.ResourceBundle;

public class Table implements Initializable {
    @FXML
    private TableView<Client> clientList;

    @FXML
    private TableColumn<Client, String> firstName, lastName, city;

    @FXML
    private TextField firstNameInput, lastNameInput, cityInput;

    public ObservableList<Client> model = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model.add(new Client("Josh", "Homme", "Joshua Tree"));
        model.add(new Client("Dave", "Grohl", "Warren"));
        model.add(new Client("Krist", "Novoselic", "Compton"));
        model.add(new Client("Robert", "Trujillo", "Santa Monica"));

        // Makes the table uneditable
        clientList.setEditable(false);

        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        city.setCellValueFactory(new PropertyValueFactory<>("city"));

        clientList.setItems(model);
    }

    public void delete() {
        // Deletes the selected entry from the TableView
        model.remove(clientList.getSelectionModel().getFocusedIndex());
    }

    public void save() {
        // Creates a new Client
        Client newClient = new Client();

        // Set the values
        newClient.setFirstName(firstNameInput.getText());
        newClient.setCity(cityInput.getText());
        newClient.setLastName(lastNameInput.getText());

        // Add the newly created client to the TableView
        model.add(newClient);
    }

    public void reset() {
        // Clears all the TextFields
        firstNameInput.clear();
        lastNameInput.clear();
        cityInput.clear();
    }
}
