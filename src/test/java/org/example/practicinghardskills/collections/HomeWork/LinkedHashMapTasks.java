package org.example.practicinghardskills.collections.HomeWork;

import org.checkerframework.checker.units.qual.K;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTasks {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> elements = new LinkedHashMap<>();
        elements.put("5key", 5);
        elements.put("1key", 1);
        elements.put("2key", 2);
        elements.put("3key", 3);
        elements.put("4key", 4);
        for (Map.Entry<String, Integer> entry : elements.entrySet()){
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }
    }
}
