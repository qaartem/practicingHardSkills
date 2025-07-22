package org.example.practicinghardskills.ConditionalStatementsAndLoops.While;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number: ");
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;
        while(i <= n){
            result *= i;
            i++;
        }
        System.out.println(result);
    }


}
