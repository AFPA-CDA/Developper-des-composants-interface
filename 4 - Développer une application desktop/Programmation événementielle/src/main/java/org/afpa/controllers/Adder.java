package org.afpa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Julien
 * @version 1.0.0
 * @since 1.0.0
 */
public class Adder implements Initializable {
    @FXML
    private TextArea TextAreaAdder;
    private int result;
    private boolean isFirst;

    /**
     * @see Initializable
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.result = 0;
        this.isFirst = true;
    }

    /**
     * Returns the result of the sum
     */
    public void add() {
        this.TextAreaAdder.appendText(" = " + this.result);
        this.isFirst = true;
    }

    /**
     * Clear the text area's text and resets the result
     */
    public void clear() {
        this.result = 0;
        this.TextAreaAdder.clear();
    }

    /**
     * Adds the numbers on the
     * @param actionEvent The event on the button click
     */
    public void numberButtonClick(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        String value = node.getUserData().toString();

        if (this.isFirst) {
            this.TextAreaAdder.appendText(value);
            this.isFirst = false;
        } else {
            this.TextAreaAdder.appendText(" + " + value);
        }

        this.result += Integer.parseInt(value);
    }
}
