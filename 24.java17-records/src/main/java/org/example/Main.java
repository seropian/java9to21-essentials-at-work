package org.example;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(5, 10);

        // Using the x() and y() methods
        System.out.println("Point1 coordinates: " + point1.x() + ", " + point1.y());

        // Using the equals() method
        System.out.println("Are point1 and point2 equal? " + point1.equals(point2));

        // Using the hashCode() method
        System.out.println("Hashcode of point1: " + point1.hashCode());

        // Using the toString() method
        System.out.println("String representation of point1: " + point1.toString());
    }
}