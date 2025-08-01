package org.example.practicinghardskills.collections.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTasks {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        nums.add(6);
        System.out.println(nums);

        for (int number : nums) {
            if (number % 2 == 0) {
                System.out.println("Even numbers:" + number);
            }
        }
    }


}
