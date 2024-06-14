package org.example;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a List with factory method
        List<String> list = List.of("Apple", "Banana", "Cherry");
        System.out.println("List: " + list);

        // Creating a Set with factory method
        Set<String> set = Set.of("Dog", "Cat", "Bird");
        System.out.println("Set: " + set);

        // Creating a Map with factory method
        Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);
        System.out.println("Map: " + map);

        //Creating a Map of entries with factory method
        Map<String, Integer> mapOfEntries = Map.ofEntries(
            Map.entry("One", 1),
            Map.entry("Two", 2),
            Map.entry("Three", 3)
        );
        System.out.println("Map of entries: " + mapOfEntries);
    }
}
