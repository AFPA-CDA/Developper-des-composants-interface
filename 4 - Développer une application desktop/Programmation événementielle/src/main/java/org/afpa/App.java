package org.afpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Entrypoint of the application
 *
 * @author Julien
 * @version 1.0.0
 * @see Application
 * @since 1.0.0
 */
public class App extends Application {
    private static Scene scene;

    /**
     * @param stage The stage to start with
     * @throws IOException If the function can't read the file
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("table"));
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param fxml The fxml file to load
     * @throws IOException If the function can't read the file
     */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * @param fxml The fxml file to load
     * @return The loaded file
     * @throws IOException If the function can't read the file
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * @param args Args given from the command line
     */
    public static void main(String[] args) {
        launch();
    }
}