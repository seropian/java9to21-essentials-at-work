package org.example;

// javac -d ./bin ./src/main/java/org/example/Main.java
// jar cvfe app.jar org.example.Main -C ./bin .
// jpackage --input . --name myapp --main-jar app.jar --main-class org.example.Main

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}