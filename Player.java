package org.example;

import javafx.scene.paint.Color;

public class Player extends Sprite {

    public Player(double x, double y, double radius) {
        super(x, y, radius);
        // Set the player color to blue
        shape.setFill(Color.BLUE);
    }
}
