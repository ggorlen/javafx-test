//package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application {
    @Override
    public void start(Stage stage) throws java.io.IOException {
        var loader = new FXMLLoader(getClass().getResource("HelloFX.fxml"));
        Scene scene = new Scene(loader.load(), 640, 480);
        stage.setTitle("JavaFX test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
