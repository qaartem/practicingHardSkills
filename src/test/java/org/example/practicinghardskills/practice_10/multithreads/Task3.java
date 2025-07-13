package org.example.practicinghardskills.practice_10.multithreads;

public class Task3 {
    static volatile boolean stop = false;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int counter = 0;
            while(!stop){
                counter++;
                System.out.println(counter);
            }
//            System.out.println(counter);
        });

        thread.start();
        Thread.sleep(2000);
        stop = true;
    }
}
