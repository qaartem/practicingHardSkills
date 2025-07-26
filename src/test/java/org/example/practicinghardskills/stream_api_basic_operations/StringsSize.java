package org.example.practicinghardskills.stream_api_basic_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsSize {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("string", "string", "str", "string123");
        List<String> result = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
