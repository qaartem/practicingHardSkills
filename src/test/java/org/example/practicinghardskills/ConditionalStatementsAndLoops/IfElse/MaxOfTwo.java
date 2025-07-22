package org.example.practicinghardskills.ConditionalStatementsAndLoops.IfElse;

import java.util.Scanner;

public class MaxOfTwo {
    /*    Задача:
Задача:
Создайте программу, которая принимает два числа и выводит наибольшее из них.
Методы и конструкции:
Scanner
if-else или Math.max()
System.out.println()
            */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Enter the second number: ");
        int second = input.nextInt();
        if (first > second){
            System.out.println("number: " + first);
        } else if (second > first) {
            System.out.println("number: " + second);
        } else {
            System.out.println("numbers are equal");
        }
    }
}
