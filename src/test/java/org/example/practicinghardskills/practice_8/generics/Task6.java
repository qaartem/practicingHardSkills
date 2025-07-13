package org.example.practicinghradskills.practice_8.generics;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        NumberBox<Double> box  = new NumberBox<>(List.of(1.2,2.0,3.0));
        System.out.println(box.sum());
        NumberBox<Integer> boxInt  = new NumberBox<>(List.of(1,2,3));
        System.out.println(boxInt.sum());
    }
}
