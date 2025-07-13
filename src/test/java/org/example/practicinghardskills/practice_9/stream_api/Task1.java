package org.example.practicinghardskills.practice_9.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = List.of("string1", "12345", "1", "123", "1234567");

        Stream<String> stream = strings.stream()
                .filter(string ->{
                    System.out.println("Before filter: " + string);
                    return string.length() > 5;
                });

        stream.forEach(string -> System.out.println("After filter: " + string));
    }
}
