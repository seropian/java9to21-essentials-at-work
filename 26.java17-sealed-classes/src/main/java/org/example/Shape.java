package org.example;

// Sealed classes are classes that have restricted hierarchies.
// They define which other classes or interfaces may extend or implement them.
public sealed abstract class Shape
        permits Circle, Rectangle {
}
