package org.example.practicinghardskills.practice_9.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,6, 15, 20,100, 0);

        Stream<Integer> stream = nums.stream()
                .map(num -> {
                    System.out.println("До преобразования: " + num);
                    return num * num;
                });
        stream.forEach(square -> System.out.println("Квадрат: " + square));
    }
}
