package com.example.tareajavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaUsuario extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();
        TextField textField = new TextField();
        Button button = new Button("Saludar");
        button.setOnAction(e -> {
            String nombre = textField.getText();
            if (!nombre.isEmpty()) {
                label.setText("Hola " + nombre);
            }
        });
        VBox root = new VBox();
        root.getChildren().addAll(textField, button, label);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
