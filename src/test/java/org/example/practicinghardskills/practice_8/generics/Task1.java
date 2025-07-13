package org.example.practicinghardskills.practice_8.generics;

public class Task1 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("String");
        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(234);
        System.out.println(integerBox.getValue());
    }
}
