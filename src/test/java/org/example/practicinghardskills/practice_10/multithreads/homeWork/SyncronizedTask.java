package org.example.practicinghardskills.practice_10.multithreads.homeWork;

public class SyncronizedTask {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable thread = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        };

        Thread a = new Thread(thread);
        a.start();

        Thread b = new Thread(thread);
        b.start();

        a.join();
        b.join();

        System.out.println(counter.getCount());
    }
}
