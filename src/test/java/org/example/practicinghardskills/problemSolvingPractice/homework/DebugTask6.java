package org.example.practicinghardskills.problemSolvingPractice.homework;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n) {
        if(n == 0) {return;}
        System.out.println(n);
        countdown(n - 1);
    }
}
