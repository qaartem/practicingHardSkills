package org.example.practicinghardskills;

import java.util.*;

public class ListMiddleUpdateBenchmark {

    public static void main(String[] args) {
        int size = 100_000;
        int middleIndex = size / 2;

        // Создаём и заполняем ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        // Создаём и заполняем LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        // Измеряем время для ArrayList
        long startArrayList = System.nanoTime();
        arrayList.set(middleIndex, -1); // Замена в середине
        long endArrayList = System.nanoTime();
        long durationArrayList = endArrayList - startArrayList;

        // Измеряем время для LinkedList
        long startLinkedList = System.nanoTime();
        linkedList.set(middleIndex, -1); // Замена в середине
        long endLinkedList = System.nanoTime();
        long durationLinkedList = endLinkedList - startLinkedList;

        System.out.println("ArrayList set() duration: " + durationArrayList + " ns");
        System.out.println("LinkedList set() duration: " + durationLinkedList + " ns");
    }
}

