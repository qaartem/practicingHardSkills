package org.example.practicinghardskills.functional_interfaces_and_lambdas;

public class AnonymousClassTask {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        runnable.run();
    }
}
