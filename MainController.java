//package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class MainController {
    @FXML
    Text output;
    @FXML
    Button clicker;

    int count;

    @FXML
    public void handleClick() {
        output.setText(++count + "");
    }

    public void initialize() {
        count = 0;
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        output.setText(
            "Hello, JavaFX " + javafxVersion +
            ", running on Java " + javaVersion + "."
        );
    }
}

