package org.example.practicinghardskills.Generics;

public class Array {
    public static void main(String[] args) {
        String[] strings = {"string1", "string1", "string1"};
        Integer[] integers = {1, 2, 3};
        Box.printArray(strings);
        Box.printArray(integers);

        Pair<String, Integer> pair1 = new Pair<>("String", 2);
        Pair<Integer, String> pair2 = new Pair<>(2, "String");
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());
    }
}
