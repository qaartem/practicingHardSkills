package org.example.practicinghardskills.practice_9.grouping_reduction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,6, 15, 20,100, 0);

        Map<Boolean, List<Integer>> stream = nums.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));

        stream.forEach((key, list) -> {
            System.out.println(key + ": " + list);
        });
    }
}
