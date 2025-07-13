package org.example.practicinghradskills.practice_9.funcinterfaces;

public class Task2 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello from anonymous class!");
        runnable.run();
    }
}
