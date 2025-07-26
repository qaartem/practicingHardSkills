package org.example.practicinghardskills.Exceptions.HomeWork;

public class DivisionTask {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        try {
            int dividedNumbers = divide(num1, num2);
            System.out.println("Result: " + dividedNumbers);
        } catch (ArithmeticException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }

    public static int divide(int x, int y) {
        return x / y;
    }

}
