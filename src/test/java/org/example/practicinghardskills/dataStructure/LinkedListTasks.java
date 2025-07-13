package org.example.practicinghradskills.dataStructure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class LinkedListTasks {
    public static void main(String[] args) {
        // 1 Task
    LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        for(String item:list){
            System.out.println(item);
        }

        // 2 Task
        LinkedList<String> queue = new LinkedList<>();
        queue.add("1 task");
        queue.add("2 task");
        queue.add("3 task");

        while (!queue.isEmpty()) {
            String task = queue.poll();
            System.out.println(task);
        }

        // 3 Task
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 4 Task
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(35);
        numbers.add(2);
        numbers.add(1);

        int sum = 0;

        for(int num : numbers){
            sum = sum + num;
        }
        System.out.println(sum);

        // 5 Task

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }





}
