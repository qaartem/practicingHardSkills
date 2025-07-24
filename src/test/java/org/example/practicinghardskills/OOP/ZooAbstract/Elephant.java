package org.example.practicinghardskills.OOP.ZooAbstract;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
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
