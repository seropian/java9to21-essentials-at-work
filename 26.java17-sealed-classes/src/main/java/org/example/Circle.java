package org.example;

//classes that extend a sealed class must be final, sealed, or non-sealed.
public final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
