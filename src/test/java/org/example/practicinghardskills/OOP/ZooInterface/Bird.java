package org.example.practicinghardskills.OOP.ZooInterface;

public class Bird implements Animal {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Bird: Chirikaet");
    }

    @Override
    public void move() {
        System.out.println("Bird: Fly");
    }
}
