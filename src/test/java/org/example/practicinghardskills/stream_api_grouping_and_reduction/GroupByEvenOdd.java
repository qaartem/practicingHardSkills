package org.example.practicinghardskills.stream_api_grouping_and_reduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEvenOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> result = nums.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(result);

    }
}
