package org.example.practicinghardskills.practice_10.multithreads.homeWork;

public class SingleThreadTask {
    public static void main(String[] args) {
        Runnable thread = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from the thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
//        thread.run();

        Thread treadRun = new Thread(thread);
        treadRun.start();


    }
}
