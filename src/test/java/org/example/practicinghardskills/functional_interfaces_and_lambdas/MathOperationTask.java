package org.example.practicinghardskills.functional_interfaces_and_lambdas;

public class MathOperationTask {
    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        MathOperation substruct = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(sum.operate(1, 2));
        System.out.println(substruct.operate(1, 2));
        System.out.println(multiply.operate(1, 2));
        System.out.println(divide.operate(1, 2));

    }
}
