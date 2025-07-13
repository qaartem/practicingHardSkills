package org.example.practicinghardskills.practice_9.grouping_reduction;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,6, 15, 20,100, 0);

        double stream = nums.stream().collect(Collectors.averagingInt(n -> n));

        System.out.println(stream);
    }
}
