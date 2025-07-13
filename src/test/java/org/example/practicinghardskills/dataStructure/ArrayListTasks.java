package org.example.practicinghradskills.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTasks {

    public static void main(String[] args) {
        // Задача 1
       ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        nums.add(6);
        System.out.println(nums);

        // Задача 2
        for(int number : nums){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }

        // Задача 3
        String longest = "";
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Cats","Pets","Dogs","4"));
        for(String animals : strings){
            if(animals.length() > longest.length()){
                longest = animals;
            }
        }
        System.out.println(longest);

        // Задача 4
        int sum = 0;
        for(int number : nums){
            sum = sum + number;

        }
        System.out.println(sum);

        // Задача 5
        System.out.println(Collections.max(nums));

    }
}
