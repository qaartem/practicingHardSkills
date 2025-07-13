package org.example.practicinghardskills.practice_8.generics;

public class Task4 {
    public static void main(String[] args) {
        Storage<String> strings = new Storage<>();
        strings.setElement("String");
        System.out.println(strings.getElement());

        Storage<Integer> integers = new Storage<>();
        integers.setElement(1);
        System.out.println(integers.getElement());
    }
}
