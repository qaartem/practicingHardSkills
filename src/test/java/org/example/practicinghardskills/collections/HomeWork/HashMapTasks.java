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

        for (Map.Entry<String, Integer> pair : pairs.entrySet()) {
            System.out.println(pair.getKey() + " is " + pair.getValue());
        }

        if (pairs.containsKey("4name")) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }

}
