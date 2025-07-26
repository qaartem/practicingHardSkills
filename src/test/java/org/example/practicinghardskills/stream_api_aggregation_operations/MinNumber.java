package org.example.practicinghardskills.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 1, 2, 3, 4, 5, 6);
        int min = nums.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }
}
