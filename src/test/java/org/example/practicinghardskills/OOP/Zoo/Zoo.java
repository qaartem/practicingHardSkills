package org.example.practicinghardskills.OOP.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();


    public void addAnimal (Animal animal){
        animals.add(animal);
    }

    public void showAll (){
        for (Animal animal : animals) {
            animal.sound();
            animal.move();
        }
    }
}
