package org.example;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Create modifiable collections
        List<String> modifiableList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Set<String> modifiableSet = new HashSet<>(Arrays.asList("D", "E", "F"));
        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.put("G", 1);
        modifiableMap.put("H", 2);
        modifiableMap.put("I", 3);

        // Create unmodifiable collections using copyOf()
        List<String> unmodifiableList = List.copyOf(modifiableList);
        Set<String> unmodifiableSet = Set.copyOf(modifiableSet);
        Map<String, Integer> unmodifiableMap = Map.copyOf(modifiableMap);

        System.out.println("Unmodifiable List: " + unmodifiableList);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);

        // Create unmodifiable collections from a stream using Collectors
        List<String> unmodifiableListFromStream = modifiableList.stream().collect(Collectors.toUnmodifiableList());
        Set<String> unmodifiableSetFromStream = modifiableSet.stream().collect(Collectors.toUnmodifiableSet());
        Map<String, Integer> unmodifiableMapFromStream = modifiableMap.entrySet().stream().collect(
                Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Unmodifiable List from Stream: " + unmodifiableListFromStream);
        System.out.println("Unmodifiable Set from Stream: " + unmodifiableSetFromStream);
        System.out.println("Unmodifiable Map from Stream: " + unmodifiableMapFromStream);
    }
}