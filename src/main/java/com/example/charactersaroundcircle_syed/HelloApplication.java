package com.example.charactersaroundcircle_syed;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    AnchorPane pain = new AnchorPane();
    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(pain, 800, 800);
        stage.setTitle("Circle Of Hell");
        stage.setScene(scene);
        stage.show();
        buildUI();
    }

    private void buildUI() {
        Circle circle = new Circle(400, 400, 250);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pain.getChildren().add(circle);
        String s = "Welcome to Java 2";

        for(int i = 0; i < s.length(); i++){
            
        }
    }


    public static void main(String[] args) {
        launch();
    }
}