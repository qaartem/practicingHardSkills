package org.example.practicinghardskills.problemSolvingPractice;

import java.util.ArrayList;
import java.util.List;

public class StringListHandler {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] inputs = {"apple", "banana", "apple", "Orange", "Banana", "Grape", "Orange"};

        for (String input : inputs) {
            if (!list.contains(input.toLowerCase())) {
                list.add(input.toLowerCase());
            }
        }

        System.out.println("Размер списка: " + list.size()); // Ожидаемый размер: 4
        System.out.println("Содержимое списка: " + list);
    }
}
