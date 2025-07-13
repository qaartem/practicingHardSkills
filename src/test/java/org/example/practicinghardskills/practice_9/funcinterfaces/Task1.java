package org.example.practicinghardskills.practice_9.funcinterfaces;

public class Task1 {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(addition.mathOperation(1,2));
        System.out.println(subtraction.mathOperation(4,2));
        System.out.println(multiplication.mathOperation(2,2));
        System.out.println(division.mathOperation(4,2));

    }
}
