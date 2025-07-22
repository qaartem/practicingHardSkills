package org.example.practicinghardskills.ConditionalStatementsAndLoops.DoWhile;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("number: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println(num);
    }
}
