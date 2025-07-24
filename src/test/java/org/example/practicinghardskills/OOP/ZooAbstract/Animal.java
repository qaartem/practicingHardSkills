package org.example.practicinghardskills.OOP.ZooAbstract;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void move();
    public abstract void sound();
}
