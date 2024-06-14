package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        final Path path = Files.createTempFile("somefile", "txt");
        final BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
        // JEP 213 allows this
        try (reader) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}