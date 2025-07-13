package org.example.practicinghardskills.mockTasks;

import java.util.HashMap;
import java.util.Map;

public class FindingNonDuplicateNumbers {

    /**
     * Реализуй метод findNonDuplicate, который находит не дублирующееся число.
     * Если не дублирующегося числа нет, верни -1.
     */
    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 4, 1, 3, 2};
        System.out.println(findNonDuplicate(numbers));
    }

    private static int findNonDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return numbers[i];
            }
        }
        return -1;
    }

    private static int findNonDuplicate2(int[] numbers) {
        Map<Integer, Integer> duplicate = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            duplicate.put(num, duplicate.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (duplicate.get(numbers[i]) == 1) {
                return numbers[i];
            }
        }

        return -1;
    }

}
