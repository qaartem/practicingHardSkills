package org.example.practicinghardskills.practice_10.multithreads.homeWork;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class VolatileTask {
    private static volatile boolean stop = false;
    private static int counter = 0;

    public static void main(String[] args) {

        Runnable thread = () -> {
            while (!stop) {
                counter++;
            }
            System.out.println(counter);
        };

        Thread treadRun = new Thread(thread);
        treadRun.start();

        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop = true;


    }
}
