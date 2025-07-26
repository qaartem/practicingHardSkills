package org.example.practicinghardskills.stream_api_basic_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 5, 5, 1, 3, 4);
        List<Integer> result = integers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(result);
    }
}
