package org.example.practicinghardskills.collections.HomeWork;

import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        for (int i = 5; i >= 1; i--) {
            nums.add(i);
        }
        System.out.println(nums);
    }
}
