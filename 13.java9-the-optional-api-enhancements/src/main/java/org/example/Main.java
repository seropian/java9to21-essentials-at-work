package org.example;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Example of `or()` method
        Optional<String> optional = Optional.of("Hello");
        Optional<String> result = optional.or(() -> Optional.of("World"));
        System.out.println("Result of or(): " + result.get()); // Outputs: Hello

        // Example of `ifPresentOrElse()` method
        Optional<String> optionalEmpty = Optional.empty();
        optionalEmpty.ifPresentOrElse(
            value -> System.out.println("Value is present: " + value),
            () -> System.out.println("Value is not present") // Outputs: Value is not present
        );

        // Example of `stream()` method
        Optional<String> optionalStream = Optional.of("Hello Stream");
        Stream<String> stream = optionalStream.stream();
        stream.forEach(System.out::println); // Outputs: Hello Stream
    }
}