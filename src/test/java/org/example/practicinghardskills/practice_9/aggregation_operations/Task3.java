package org.example.practicinghardskills.practice_9.aggregation_operations;

import java.util.List;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,6, 15, 20,100, 0);
        int stream = nums.stream().mapToInt(n -> n).sum();

        System.out.println(stream);
    }
}
