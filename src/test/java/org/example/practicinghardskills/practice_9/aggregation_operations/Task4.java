package org.example.practicinghardskills.practice_9.aggregation_operations;

import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = List.of("String", "List", "Bob", "Bober");

        Optional<String> stream = strings.stream()
                .filter(s -> s.startsWith("B")).findFirst();
if(stream.isPresent()) {
    System.out.println(stream.get());
}else{
    System.out.println("Doesn't exist word starts with B");
}
    }
}
