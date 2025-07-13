package org.example.practicinghardskills.practice_8.generics;

public class Task2 {
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        String[] strings = {"String", "String2", "String3", "String4"};
        printArray(strings);

        Integer[] integers = {1,2,3,4};
        printArray(integers);
    }
}
