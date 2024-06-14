package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");

        // Using 'var' in lambda expression
        items.forEach((var item) -> System.out.println(item));
    }
}
