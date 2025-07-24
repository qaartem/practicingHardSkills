package org.example.practicinghardskills.collections.HomeWork;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTasks {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("string1", "string2", "string3", "string4", "string5"));
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings);
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");

        while(!tasks.isEmpty()){
            String string = tasks.poll();
            System.out.println(string);
        }
    }
}
