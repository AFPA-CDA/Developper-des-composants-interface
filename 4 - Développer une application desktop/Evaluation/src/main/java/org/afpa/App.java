package org.afpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private static Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("index"));

        stage.setResizable(false);
        stage.setTitle("Clients - DAO");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Loads an FXML file
     *
     * @param fxml The fxml file to load
     * @return The loaded file
     * @throws IOException If the function can't read the file
     */
    private static Parent loadFXML(String fxml) throws IOException {
        return new FXMLLoader(App.class.getResource(fxml + ".fxml")).load();
    }
}