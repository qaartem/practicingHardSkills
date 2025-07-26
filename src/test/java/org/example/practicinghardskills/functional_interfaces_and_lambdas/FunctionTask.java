package org.example.practicinghardskills.functional_interfaces_and_lambdas;

import java.util.function.Function;

public class FunctionTask {
    public static void main(String[] args) {
        Function<String, Integer> size = x -> x.length();

        System.out.println(size.apply("test"));
    }
}
