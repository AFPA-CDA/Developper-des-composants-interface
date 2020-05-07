package org.afpa.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Colors implements Initializable {
    @FXML
    private Rectangle colorResult, redRectangle, greenRectangle, blueRectangle;

    @FXML
    private Slider redSlider, greenSlider, blueSlider;

    private int red, green, blue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.red = 0;
        this.green = 0;
        this.blue = 0;

        this.redSlider.valueProperty().addListener((event, oldValue, newValue) -> {
            this.red = newValue.intValue();
            this.redRectangle.setFill(Color.rgb(this.red, 0, 0));
            this.colorResult.setFill(Color.rgb(this.red, this.green, this.blue));
        });

        this.greenSlider.valueProperty().addListener((event, oldValue, newValue) -> {
            this.green = newValue.intValue();
            this.greenRectangle.setFill(Color.rgb(0, this.green, 0));
            this.colorResult.setFill(Color.rgb(this.red, this.green, this.blue));
        });

        this.blueSlider.valueProperty().addListener((event, oldValue, newValue) -> {
            this.blue = newValue.intValue();
            this.blueRectangle.setFill(Color.rgb(0, 0, this.blue));
            this.colorResult.setFill(Color.rgb(this.red, this.green, this.blue));
        });
    }
}
