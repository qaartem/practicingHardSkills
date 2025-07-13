package org.example.practicinghradskills.dataStructure;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.PriorityQueue;

public class ArrayDequeTasks {
    public static void main(String[] args) {

        ArrayDeque<Integer> nums = new ArrayDeque<>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        System.out.println(nums);

        ArrayDeque<Integer> nums2 = new ArrayDeque<>();
        nums2.push(5);
        nums2.push(8);
        nums2.push(3);
        nums2.push(1);
        nums2.push(2);
        while (!nums2.isEmpty()){
            System.out.println(nums2.pop());
        }

        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.addFirst("2");
        queue.addFirst("1");
        queue.addLast("3");
        queue.addLast("4");
        System.out.println("queue До: " + queue);


        System.out.println("queue После: removeFirst - " + queue.removeFirst() + ", removeLast - "  + queue.removeLast() + ", Остаток очереди: " + queue);
        

    }
}
