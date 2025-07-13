package org.example.practicinghardskills.OOP.Zoo;

public class Elephant extends Animal{
    public Elephant(String name) {
        super(name);
    }

    public void sound(){
        System.out.println("Elephant: Trubit");
    }

    public void move(){
        System.out.println("Elephant: Walks");
    }
}
