package org.example.practicinghardskills.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Condition {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 1, 2, 3, 4, 5, 6);
        boolean match = nums.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(match);
    }
}
