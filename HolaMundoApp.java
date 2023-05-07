package com.example.tareajavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaMundoApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hola mundo");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hola mundo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}


