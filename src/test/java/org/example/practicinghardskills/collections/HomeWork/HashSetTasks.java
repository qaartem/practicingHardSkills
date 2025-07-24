package org.example.practicinghardskills.collections.HomeWork;

import java.util.HashSet;

public class HashSetTasks {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            nums.add(i);
        }
        System.out.println(nums);
        for (Integer num : nums) {
            System.out.println(num);
        }

        for (int i = 6; i <= 10; i++) {
            nums.add(i);
        }
        System.out.println("10 nums" + nums);
        if (!nums.contains(10)) {
            System.out.println("nums does not contains 10");
        } else {
            System.out.println("nums contains 10");
        }


    }
}
