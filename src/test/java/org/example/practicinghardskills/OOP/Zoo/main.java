package org.example.practicinghradskills.OOP.Zoo;

public class main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant("Слон");
        Animal bird = new Bird("Птица");
        zoo.addAnimal(elephant);
        zoo.addAnimal(bird);
        zoo.showAll();
    }
}
