package org.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Agario");

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.WHITE);

        Player player = new Player(400, 300, 20);

        root.getChildren().add(player.getShape());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}