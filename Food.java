package org.example;

import javafx.scene.paint.Color;

public class Food extends Sprite {

    public Food(double x, double y, double radius) {
        super(x, y, radius);
        // Set the food color to green
        shape.setFill(Color.GREEN);
    }
}
