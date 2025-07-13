package org.example.practicinghardskills.practice_10.multithreads;

import org.checkerframework.checker.units.qual.C;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                counter.increment();
            }

        });
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                counter.increment();
            }

        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println(counter.getCount());
    }
}
