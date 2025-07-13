package org.example.practicinghradskills.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {
        // 1 задача
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Alice", 25);
        people.put("Artem", 26);
        people.put("Bob", 27);
        people.put("Pop", 28);
        people.put("Liza", 15);

        for(Map.Entry<String, Integer> people2 : people.entrySet()){
            System.out.println(people2.getKey() + " - " + people2.getValue());
        }

        // 2 задача
        if (people.containsKey("Alice")) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }

        // 3 задача
        printUnderage(people);
    }

    public static void printUnderage(Map<String, Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() < 18){
                System.out.println(entry.getKey()+ " - " + entry.getValue());
            }
        }
    }
}
