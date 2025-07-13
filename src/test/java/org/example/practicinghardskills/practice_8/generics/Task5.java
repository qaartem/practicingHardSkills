package org.example.practicinghradskills.practice_8.generics;

import java.util.List;

public class Task5 {
    public static <T> void printList(List<T> list){
        for (T element: list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> strings =List.of("String1", "String2");
        printList(strings);
        List<Integer> nums =List.of(1, 2);
        printList(nums);
    }
}
