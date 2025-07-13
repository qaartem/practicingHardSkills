package org.example.practicinghardskills.practice_10.multithreads;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(
                () -> {
                    for(int i = 0; i < 5; i++){
                        System.out.println("A");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Поток А прерван");
                            return;
                        }
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    for(int i = 0; i < 5; i++){
                        System.out.println("B");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            System.out.println("Поток B прерван");
                            return;
                        }
                    }
                }
        );

        thread.start();
        thread2.start();
        thread.interrupt();
        thread2.interrupt();
        thread.join();
        thread2.join();

        System.out.println("Основной поток завершился");
    }
}
