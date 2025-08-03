package org.example.practicinghardskills.problemSolvingPractice.homework;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome(String str) {
        if(str == null || str.isEmpty()) {return false;}
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
