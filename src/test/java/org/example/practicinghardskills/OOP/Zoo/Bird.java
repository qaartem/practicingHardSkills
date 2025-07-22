package org.example.practicinghardskills.OOP.Zoo;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
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
