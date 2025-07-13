package org.example.practicinghardskills.practice_9.aggregation_operations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,6, 15, 20,100, 0);

        boolean stream = nums.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(stream);
    }
}
