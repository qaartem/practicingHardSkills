package org.example.practicinghardskills.collections.arrayList;

import java.util.Arrays;
import java.util.Collections;


public class ArrayList {
    public static void main(String[] args) {
        // Task 1
        java.util.ArrayList<Integer> nums = new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5));
        nums.add(6);
        System.out.println(nums);

        // Task 2
        java.util.ArrayList<Integer> evenNums = new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
            for (int number : evenNums) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
        }

        // Task 3
        java.util.ArrayList<String> strings = new java.util.ArrayList<>(Arrays.asList("a","b","c","theLongest"));
        String longest = "";
        for (String string : strings) {
            if (string.length() > longest.length()) {
                longest = string;
            }
        }
        System.out.println(longest);

        // Task 4
        int sum = 0;
        for (int number : nums) {
            sum = sum + number;
        }
        System.out.println(sum);

        // Task 5
        System.out.println(Collections.max(nums));

        int max = nums.get(0);
        for (int number : nums) {
            if (number > max) {
                max=number;
            }
        }
    }
    }
