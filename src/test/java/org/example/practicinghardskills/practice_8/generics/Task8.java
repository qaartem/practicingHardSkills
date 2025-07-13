package org.example.practicinghardskills.practice_8.generics;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void addNums(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        addNums(nums);
        System.out.println(nums);

        List<Object> nums1 = new ArrayList<>();
        addNums(nums1);
        System.out.println(nums1);

    }

}
