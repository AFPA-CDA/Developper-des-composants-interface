package org.afpa.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Julien
 * @version 1.0.0
 * @since 1.0.0
 */
public class Checked implements Initializable {
    @FXML
    private TextField UserInput;

    @FXML
    private Label ResultText;

    @FXML
    private ToggleGroup BackgroundGroup, TextGroup, CaseGroup;

    @FXML
    private CheckBox CheckBackground, CheckText, CheckCase;

    @FXML
    private TitledPane ChoicesPane, BackgroundPane, TextPane, CasePane;

    /**
     * @see Initializable
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /**
     * When the background color choice is enabled
     * It enables the background pane
     */
    public void backgroundChoice() {
        this.resetCheckbox(this.BackgroundPane, this.CheckBackground, this.BackgroundGroup, "-fx-background-color: transparent");
    }

    /**
     * When the background color choice is enabled
     * It enables the text pane
     */
    public void textChoice() {
        this.resetCheckbox(this.TextPane, this.CheckText, this.TextGroup, "-fx-text-fill: black");
    }

    /**
     * When the background color choice is enabled
     * It enables the case pane
     */
    public void checkCase() {
        this.CasePane.disableProperty().set(!this.CheckCase.isSelected());

        if (this.CaseGroup.getSelectedToggle() != null) {
            this.CaseGroup.getSelectedToggle().setSelected(false);
        }
    }

    /**
     * On User input key release checks if the user input is empty
     * If it is then the choices are disabled
     * Otherwise they are enabled
     */
    public void toggleChoices() {
        String userInput = this.UserInput.getText();

        if (this.CaseGroup.getSelectedToggle() != null) {
            if ((this.CaseGroup.getSelectedToggle().getUserData()).equals("uppercase"))
                this.ResultText.setText(this.UserInput.getText().toUpperCase());
            else if ((this.CaseGroup.getSelectedToggle().getUserData()).equals("lowercase"))
                this.ResultText.setText(this.UserInput.getText().toLowerCase());
            else
                this.ResultText.setText(this.UserInput.getText());
        } else {
            this.ResultText.setText(this.UserInput.getText());
        }

        this.ChoicesPane.disableProperty().set(userInput.length() <= 0);
    }

    /**
     * Resets the checkboxes in their defaults
     */
    public void resetCheckbox(TitledPane pane, CheckBox checkbox, ToggleGroup toggleGroup, String defaultStyle) {
        pane.disableProperty().set(!checkbox.isSelected());

        this.ResultText.setStyle(this.ResultText.getStyle() + ";" + defaultStyle);

        if (toggleGroup.getSelectedToggle() != null) {
            toggleGroup.getSelectedToggle().setSelected(false);
        }
    }

    /**
     * Set style to String (Background and text color)
     * @param toggleGroup : Radios group enable
     * @param styleProperty : CSS property to set
     */
    public void setStyleColor(ToggleGroup toggleGroup, String styleProperty) {
        if (toggleGroup.getSelectedToggle() != null) {
            String color = (String) toggleGroup.getSelectedToggle().getUserData();
            this.ResultText.setStyle(this.ResultText.getStyle() + ";" + styleProperty + ":" + color);
        }
    }


    /**
     * On checkboxes action it changes the user input css
     */
    public void setCheckboxCss() {
        setStyleColor(this.BackgroundGroup, "-fx-background-color");
        setStyleColor(this.TextGroup, "-fx-text-fill");
        this.toggleChoices();
    }
}
