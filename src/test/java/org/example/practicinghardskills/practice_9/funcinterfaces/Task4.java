package org.example.practicinghradskills.practice_9.funcinterfaces;

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> size = string -> string.length();

        System.out.println(size.apply("String"));
        System.out.println(size.apply("1"));
        System.out.println(size.apply(" "));
    }
}
