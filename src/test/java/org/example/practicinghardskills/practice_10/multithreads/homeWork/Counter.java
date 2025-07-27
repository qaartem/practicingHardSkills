package org.example.practicinghardskills.practice_10.multithreads.homeWork;

import javax.swing.*;

public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
