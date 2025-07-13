package org.example.practicinghardskills.thirdSetOfTasks;

public class MathConstants {
    private static final double PI = 3.14159;
    private final double E = 2.71828;

    public static double calculateArea(double radius){
        return PI * Math.pow(radius, 2);
    }

    public static double calculateCircumference(double radius){
        return 2 * PI * radius;
    }
}
