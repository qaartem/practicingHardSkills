package org.example.practicinghardskills.stream_api_grouping_and_reduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("string", "strin", "str", "string123", "Bob", "Artem", "Name");
        Map<Character, List<String>> result = strings.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println(result);
    }
}
