package org.example.practicinghardskills.practice_10.multithreads;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for(int i =0; i< 5; i++){
                System.out.println("Привет из потока!");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван");
                    return;
                }
            }
        });

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
//        thread.join();
        System.out.println("Основной поток завершился");
    }
}
