package com.example.tareajavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaMundoConBoton extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();
        Button button = new Button("Pulsa aquí");
        button.setOnAction(e -> label.setText("Hola mundo"));
        StackPane root = new StackPane();
        root.getChildren().addAll(label, button);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

