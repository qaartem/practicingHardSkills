package org.example.practicinghardskills.collections.HomeWork;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        PriorityQueue <Integer> nums = new PriorityQueue<>();
        nums.add(5);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        while (!nums.isEmpty()){
            System.out.println(nums.poll());
        }
    }
}
