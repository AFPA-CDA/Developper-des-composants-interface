package org.afpa.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.afpa.dal.models.Client;

import java.net.URL;
import java.util.ResourceBundle;

public class Index implements Initializable {
    @FXML
    private TableColumn<Client, String> firstName, lastName;

    @FXML
    private TableView<Client> clients;


    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        this.lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    }
}
