package org.example.practicinghardskills.OOP.Zoo;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public void sound(){
        System.out.println("Bird: Chirikaet");
    }

    public void move(){
        System.out.println("Bird: Fly");
    }
}
