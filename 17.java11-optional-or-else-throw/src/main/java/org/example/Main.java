package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello world!");

        // Get value from Optional or throw NoSuchElementException if it's empty
        String value = optional.orElseThrow();

        System.out.println(value);

        // Create an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Attempt to get value from empty Optional, this will throw NoSuchElementException
        String emptyValue = emptyOptional.orElseThrow();
    }
}