package org.example.practicinghardskills.collections.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {
        HashMap<String, Integer> pairs = new HashMap<>();
        pairs.put("1name", 1);
        pairs.put("2name", 2);
        pairs.put("3name", 3);
        pairs.put("4name", 4);
        pairs.put("5name", 5);
        printMap(pairs);
        checkKey(pairs, "4name");
    }

    private static void printMap(Map<String, Integer> map) {
        System.out.println("Printing map entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }
    }

    private static void checkKey(Map<String, Integer> map, String key) {
        if (map.containsKey(key)) {
            System.out.println("Key '" + key + "' найдено");
        } else {
            System.out.println("Key '" + key + "' не найдено");
        }
    }

}
