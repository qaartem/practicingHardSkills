package org.example.practicinghardskills.practice_10.multithreads.homeWork;

public class TwoThreadsTask {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread a = new Thread(thread1);
        a.start();

        Thread b = new Thread(thread2);
        b.start();


    }
}
