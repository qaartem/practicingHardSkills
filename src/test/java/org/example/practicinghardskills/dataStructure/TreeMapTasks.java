package org.example.practicinghradskills.dataStructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static javax.swing.UIManager.put;

public class TreeMapTasks {
    public static void main(String[] args) {
        TreeMap<String, Integer> people = new TreeMap<>();
        people.put("Zoe", 25);
        people.put("Pop", 26);
        people.put("Bob", 27);
        people.put("Artem", 28);
        people.put("Alice", 15);
        for (Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        TreeMap<Integer, Integer> numbers = new TreeMap<>();
        numbers.put(5, 100);
        numbers.put(4, 100);
        numbers.put(3, 100);
        numbers.put(2, 100);
        numbers.put(1, 100);
        System.out.println("минимальный ключ: " + numbers.firstKey() + ", максимальный ключ: " + numbers.lastKey());
    }
}
