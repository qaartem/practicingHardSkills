package org.example.practicinghardskills.functional_interfaces_and_lambdas;

import java.util.function.Predicate;

public class PredicateTask {

    public static void main(String[] args) {
        Predicate<Integer> even = x -> x % 2 == 0;

        System.out.println(even.test(2));
        System.out.println(even.test(3));
    }


}
