package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        sequencedCollection();
        sequencedSet();
        sequencedMap();
    }

    private static void sequencedCollection() {
        SequencedCollection<Integer> sequencedCollection = new ArrayList<>();

        sequencedCollection.add(1); // Collection contains: [1]
        sequencedCollection.addFirst(0); // Collection contains: [0, 1]
        sequencedCollection.addLast(2); // Collection contains: [0, 1, 2]

        Integer firstElement = sequencedCollection.getFirst(); // 0
        Integer lastElement = sequencedCollection.getLast(); // 2

        SequencedCollection<Integer> reversed = sequencedCollection.reversed();
        System.out.println(reversed); // Prints [2, 1, 0]

        // Note that any modification to the collection is visible in the methods, including the reversed view.
        sequencedCollection.add(3);
        System.out.println(sequencedCollection); // Prints [0, 1, 2, 3]
        System.out.println(sequencedCollection.reversed()); // Prints [3, 2, 1, 0]
    }

    private static void sequencedSet() {
        SequencedSet<Integer> sequencedSet = new LinkedHashSet<>();

        sequencedSet.add(1); // Collection contains: [1]
        sequencedSet.add(1); // Collection contains: [1]
        sequencedSet.add(2); // Collection contains: [1, 2]

        Integer firstElement = sequencedSet.getFirst(); // 1
        Integer lastElement = sequencedSet.getLast(); // 2

        SequencedSet<Integer> reversed = sequencedSet.reversed();
        System.out.println(reversed); // Prints [2, 1]

        // Note that any modification to the collection is visible in the methods, including the reversed view.
        sequencedSet.add(3);
        System.out.println(sequencedSet); // Prints [1, 2, 3]
        System.out.println(sequencedSet.reversed()); // Prints [3, 2, 1]
    }

    private static void sequencedMap() {
        SequencedMap<String, Integer> sequencedMap = new LinkedHashMap<>();

        sequencedMap.put("One", 1); // Map contains: {"One"=1}
        sequencedMap.putFirst("Zero", 0); // Map contains: {"Zero"=0, "One"=1}
        sequencedMap.putLast("Two", 2); // Map contains: {"Zero"=0, "One"=1, "Two"=2}

        String firstKey = sequencedMap.firstEntry().getKey(); // "Zero"
        String lastKey = sequencedMap.lastEntry().getKey(); // "Two"

        SequencedMap<String, Integer> reversed = sequencedMap.reversed();
        System.out.println(reversed); // Prints {"Two"=2, "One"=1, "Zero"=0}

        // Note that any modification to the map is visible in the methods, including the reversed view.
        sequencedMap.put("Three", 3);
        System.out.println(sequencedMap); // Prints {"Zero"=0, "One"=1, "Two"=2, "Three"=3}
        System.out.println(sequencedMap.reversed()); // Prints {"Three"=3, "Two"=2, "One"=1, "Zero"=0}
    }


}
