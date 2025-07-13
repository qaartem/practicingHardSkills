package org.example.practicinghardskills.practice_9.funcinterfaces;

import java.util.function.Consumer;

public class Task5 {
    public static void main(String[] args) {
        Consumer <String> string = print -> System.out.println(print);

        string.accept("String");
    }
}
