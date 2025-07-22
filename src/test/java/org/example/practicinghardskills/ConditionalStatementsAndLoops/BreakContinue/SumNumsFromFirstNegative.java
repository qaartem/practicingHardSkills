package org.example.practicinghardskills.ConditionalStatementsAndLoops.BreakContinue;

import java.util.Scanner;

public class SumNumsFromFirstNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("number: ");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
