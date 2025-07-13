package org.example.practicinghradskills.practice_8.generics;

import java.util.List;

public class Task7 {
    public static <T extends Number> void sumList(List<T> list){
        double sum = 0;
        for (T element:list){
            sum+=element.doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<Double> box  = List.of(1.2,2.0,3.0);
        sumList(box);
        List<Integer> boxInt  = List.of(1,2,3);
        sumList(boxInt);
    }
}
