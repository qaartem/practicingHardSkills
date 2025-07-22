package org.example.practicinghardskills.ConditionalStatementsAndLoops.IfElse;

import java.util.Scanner;

public class NumberSignChecker {
    /*    Задача:
        Напишите программу, которая принимает с консоли число и проверяет:
        Если число больше 0, выведите "Число положительное".
        Если меньше 0 — "Число отрицательное".
        Если равно 0 — "Число равно нулю".
        Методы и конструкции:
        Scanner
    if, else if, else
            System.out.println()

    Определение знака числа: считай число с консоли с помощью Scanner.
    Используй if-else для трёх условий: больше, меньше или равно нулю.
    В каждом случае выведи нужную строку.
            */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
