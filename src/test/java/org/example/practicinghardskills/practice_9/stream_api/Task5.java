package org.example.practicinghardskills.practice_9.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = List.of("String", "List", "Duplicate", "String", "List3", "List2", "Duplicate");

        Stream<String> stream = strings.stream().distinct();
        System.out.println("Список изначально: " + strings);
        stream.forEach(unique -> System.out.println(unique));
    }


}
