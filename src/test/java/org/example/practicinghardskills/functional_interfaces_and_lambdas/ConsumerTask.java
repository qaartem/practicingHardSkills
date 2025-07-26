package org.example.practicinghardskills.functional_interfaces_and_lambdas;

import java.util.concurrent.CompletionService;
import java.util.function.Consumer;

public class ConsumerTask {
    public static void main(String[] args) {
        Consumer <String> string = x -> System.out.println(x);
        string.accept("Привет");
    }
}
