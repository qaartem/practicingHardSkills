package org.example.practicinghardskills.practice_9.aggregation_operations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,6, 15, 20,100, 0);

        Optional<Integer> stream = nums.stream().max(Comparator.naturalOrder());

        if (stream.isEmpty()){
        System.out.println("List is empty");
    } else {
            System.out.println(stream.get());
        }
}
}
