package org.example.practicinghradskills.dataStructure;

import java.util.LinkedHashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class LinkedHashMapTasks {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
        people.put("Alice", 25);
        people.put("Artem", 26);
        people.put("Bob", 27);
        people.put("Pop", 28);
        people.put("Liza", 15);

        for (Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Alice", "25");
        phoneBook.put("Artem", "26");
        phoneBook.put("Bob", "27");
        phoneBook.put("Pop", "28");
        phoneBook.put("Liza", "15");

        if (phoneBook.containsKey("Alice")) {
            System.out.println("Контакт найден");
        } else {
            System.out.println("Контакт не найден");
        }

        LinkedHashMap<String, String> history = new LinkedHashMap<>();
        history.put("1", "homePage");
        history.put("2", "DetailPage");
        history.put("3", "productOage");
        history.put("4", "myAccount");
        history.put("5", "SERP");

        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println("До: " + entry.getKey() + " - " + entry.getValue());
        }

        if (history.size() >= 5) {
            String firstKey = history.keySet().iterator().next();
            history.remove(firstKey);
        }

        history.put("6", "basketPage");

        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println("После апдейта: " + entry.getKey() + " - " + entry.getValue());
        }


    }

}
