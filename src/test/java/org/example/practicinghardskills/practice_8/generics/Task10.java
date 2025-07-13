package org.example.practicinghradskills.practice_8.generics;

import java.util.Map;

public class Task10 {
    public static <K, V> void printMap(Map<K, V> map){
        for(Map.Entry<K, V> element: map.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("String1", 1, "String2", 2);
        printMap(map);
    }

}
