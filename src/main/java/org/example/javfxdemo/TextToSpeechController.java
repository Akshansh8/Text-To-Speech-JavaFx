package org.example.javfxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TextToSpeechController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}