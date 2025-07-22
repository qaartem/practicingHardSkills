package org.example.practicinghardskills.ConditionalStatementsAndLoops.Switch;

import java.util.Scanner;

public class DaysOfTheWeekByNum {
    /*    Задача:
Реализуйте программу, которая принимает с консоли число от 1 до 7 и выводит название соответствующего дня недели (например, 1 — "Понедельник").
Методы и конструкции:
Scanner
switch-case
System.out.println()
default (для обработки некорректного ввода)
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-7 number: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");

        }
    }
}
