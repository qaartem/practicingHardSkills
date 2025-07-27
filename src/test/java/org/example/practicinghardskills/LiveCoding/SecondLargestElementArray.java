package org.example.practicinghardskills.LiveCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class SecondLargestElementArray {
    public static int secondLargestElement(int[] array) {
        if (array.length < 2){
            throw new IllegalArgumentException("Array should have 2 elements");
        }
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static int secondLargestElementStream(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No second largest element"));
    }

}
