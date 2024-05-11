package org.example.javfxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class TextToSpeech extends Application {
    private static  final int APP_WIDTH = 375;
    private  static final int APP_HEIGHT = 475;
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = createScene();
        stage.setTitle("Text-To Speech App");
        stage.setScene(scene);
        stage.show();
    }

    public Scene createScene(){
        VBox box = new VBox();
        Label textToSpeechLabel = new Label("Text-To-Speech");
        textToSpeechLabel.setMaxWidth(Double.MAX_VALUE);
        text
        box.getChildren().add(textToSpeechLabel);
        return  new Scene(box, APP_WIDTH, APP_HEIGHT);
    }

    public static void main(String[] args) {
        launch();
    }
}