package org.example.practicinghardskills.OOP.ZooInterface;

public class Elephant implements Animal {
    private String name;

    public Elephant(String name) {
        this.name = name;
    }


    @Override
    public void sound() {
        System.out.println("Elephant: Trubit");
    }

    @Override
    public void move() {
        System.out.println("Elephant: Walks");
    }
}
