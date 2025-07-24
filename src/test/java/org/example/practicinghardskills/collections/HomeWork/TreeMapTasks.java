package org.example.practicinghardskills.collections.HomeWork;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Artem", 10);
        map.put("Elisabeth", 11);
        map.put("Yana", 213);
        map.put("Alex", 123);
        map.put("Petya", 12);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }
    }
}
