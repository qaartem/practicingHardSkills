package org.example.practicinghardskills.practice_9.funcinterfaces;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> even = number -> number % 2 == 0;

        System.out.println(even.test(2));
        System.out.println(even.test(-1));
        System.out.println(even.test(0));
        System.out.println(even.test(3));

    }
}
