package org.example;

import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Write a file using the default charset (UTF-8)
        Files.writeString(Paths.get("test.txt"), "Hello, world!");

        // Read the file using the default charset (UTF-8)
        String content = Files.readString(Paths.get("test.txt"));

        System.out.println(content);
    }
}