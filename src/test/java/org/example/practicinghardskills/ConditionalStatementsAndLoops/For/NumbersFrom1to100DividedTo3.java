package org.example.practicinghardskills.ConditionalStatementsAndLoops.For;

import java.util.Scanner;

public class NumbersFrom1to100DividedTo3 {
    /*    Задача:
Задача:
Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
Методы и конструкции:
for
оператор %
if
System.out.println()
        */
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
