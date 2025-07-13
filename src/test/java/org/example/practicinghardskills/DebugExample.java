package org.example.practicinghardskills;

public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = calculate(a, b);
        System.out.println("Result: " + result);
    }

    public static int calculate(int x, int y) {
        int sum = x + y;
        int product = x * y;
        int finalResult = sum + product;
        return finalResult;
    }
}
