package com.example.charactersaroundcircle_syed;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.text.Font.font;

public class HelloApplication extends Application {
    AnchorPane pain = new AnchorPane();
    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(pain, 500, 500);
        stage.setTitle("Circle Of Hell");
        stage.setScene(scene);
        stage.show();
        buildUI();
    }

    private void buildUI() {
        Circle circle = new Circle(250, 250, 150);
        circle.setFill(Color.WHITE);
        //circle.setStroke(Color.BLACK);
        pain.getChildren().add(circle);
        String s = "Welcome to Java 2  ";
        //Find changing increment
        double changeIncrement = 360.0 / s.length();

        for(int i = 0; i < s.length(); i++){
            //Assign Theta IN RADIANS DAMNIT. NOBODY TOLD ME THE MATH TRIG METHODS TOOK RADIANS AS ARGUMENTS. BRO.
            double theta = (Math.PI / 180.0) * (changeIncrement * (i + 1));
            //Assign Z
            double z = circle.getRadius();
            //Determine the values of X and Y in accordance to the previously written trigonometric functions.
            double x = z * (Math.cos(theta));
            double y = z * (Math.sin(theta));

            //Create Text object in appropriate location
            Text t = new Text(circle.getCenterX() + x, circle.getCenterY() + y, s.substring(i, i + 1));
            Font f = font("Arial", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 50);
            t.setFont(f);
            t.setRotate(changeIncrement * (i + 1) + 90);
            pain.getChildren().add(t);
        }
    }


    public static void main(String[] args) {
        launch();
    }
}