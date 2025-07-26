package org.example.practicinghardskills.stream_api_grouping_and_reduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 1, 2, 3, 4, 5, 6);
        double result = nums.stream().collect(Collectors.averagingInt(n -> n));
        System.out.println(result);
    }
}
