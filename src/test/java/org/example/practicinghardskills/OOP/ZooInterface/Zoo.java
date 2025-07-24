package org.example.practicinghardskills.OOP.ZooInterface;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAll() {
        for (Animal animal : animals) {
            animal.sound();
            animal.move();
            System.out.println();
        }
    }
}
