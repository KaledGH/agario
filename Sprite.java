package org.example;

import javafx.scene.shape.Circle;

public class Sprite {
    protected double x, y;
    protected double radius;
    protected Circle shape;

    public Sprite(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        // Create a circle representing the sprite
        this.shape = new Circle(x, y, radius);
    }

    public Circle getShape() {
        return shape;
    }
}
