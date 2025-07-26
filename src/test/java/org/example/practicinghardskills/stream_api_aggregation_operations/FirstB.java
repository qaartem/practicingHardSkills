package org.example.practicinghardskills.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstB {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Bob", "strin", "British", "string123");
        Optional<String> result = strings.stream().filter(s -> s.startsWith("B")).findFirst();
        System.out.println(result);
    }
}
