package org.example.practicinghardskills.practice_8.generics;

public class Task3 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(2, "value1");
        System.out.println(pair.getValue() + " " + pair.getKey());

        Pair<String, String> pair2 = new Pair<>("value1", "value1");
        System.out.println(pair2.getValue() + " " + pair2.getKey());
    }
}
