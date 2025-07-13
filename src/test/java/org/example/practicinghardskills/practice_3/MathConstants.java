package org.example.practicinghardskills.practice_3;

public class MathConstants {
    private static final double PI = 3.14159;
    private static final double E = 2.71828;

    public static double calculateCircleArea(double r){
        return  PI * r * r;
    }

    public static double calculateCircumference(double r){
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        System.out.println(calculateCircumference(9));
        System.out.println(calculateCircleArea(5));
        System.out.println(calculateCircumference(10.0));
        System.out.println(calculateCircleArea(4.0));
    }
}
