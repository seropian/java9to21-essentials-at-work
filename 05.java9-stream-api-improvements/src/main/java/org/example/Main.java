package org.example;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 4, 6, 8, 9, 10, 12);

        // Using takeWhile
        System.out.println("Using takeWhile:");
        stream.takeWhile(n -> n % 2 == 0).forEach(System.out::println);

        // Resetting the stream
        stream = Stream.of(2, 4, 6, 8, 9, 10, 12);

        // Using dropWhile
        System.out.println("Using dropWhile:");
        stream.dropWhile(n -> n % 2 == 0).forEach(System.out::println);

        //using Stream.iterate
        System.out.println("Using Stream.iterate:");
        Stream.iterate(0, i -> i < 10, i -> i + 1).forEach(System.out::println);
    }
}