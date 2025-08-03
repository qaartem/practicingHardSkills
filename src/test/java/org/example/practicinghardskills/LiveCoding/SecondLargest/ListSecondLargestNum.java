package org.example.practicinghardskills.LiveCoding.SecondLargest;

import java.util.Arrays;
import java.util.List;

public class ListSecondLargestNum {
    public static int secondLargestElementFromList(List<Integer> numbers) {
        return numbers.stream()
                .distinct()                                 // убираем дубликаты
                .sorted((a, b) -> Integer.compare(b, a))   // сортировка по убыванию
                .skip(1)                                    // пропускаем наибольший
                .findFirst()                                // берём второй по величине
                .orElseThrow(() -> new IllegalArgumentException("Not enough unique elements"));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 30, 40, 40, 50);
        int result = secondLargestElementFromList(list);
        System.out.println("Second largest unique element: " + result); // → 40
    }

}
