package org.example.practicinghardskills.practice_9.grouping_reduction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
        public static void main(String[] args) {
            List<String> strings = List.of("Last", "List", "Bob", "Bober");

            Map<Character, List<String>> stream = strings.stream()
                    .collect(Collectors.groupingBy(word -> word.charAt(0)));

            stream.forEach((key, list) -> {
                System.out.println(key + ": " + list);
            });
        }
    }

