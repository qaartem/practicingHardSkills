package org.example.practicinghardskills.practice_9.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,6, 15, 20,100, 0);

        Stream<Integer> stream = nums.stream()
                .filter(number -> {
                    System.out.println("Число до фильтрации: " + number);
                    return number % 5 == 0 && number != 0;
                });

        stream.forEach(number -> System.out.println("Число после фильтрации: " + number));
    }

}
