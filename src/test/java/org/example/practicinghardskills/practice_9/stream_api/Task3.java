package org.example.practicinghardskills.practice_9.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = List.of("String", "List", " ");

        Stream<Integer> stream = strings.stream()
                .map(string -> {
                    System.out.println("До преобразования: " + string);
                    return string.length();
                });

        stream.forEach(lengt -> System.out.println("Длина: " + lengt));
    }
}
