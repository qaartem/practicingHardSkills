package org.example.practicinghardskills.collections.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapTasks {
    public static void main(String[] args) {
        // Task 1
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Создан пустой HashMap: " + map);
        // 2️⃣ Добавление элементов
        map.put("Artem", 1);
        map.put("Olga", 2);
        map.put("Yura", 3);
        map.put("Artem", 100); // Перезаписывает значение
        map.put("Ivan", 5);
        map.put("Artur", 7);
        System.out.println("После добавлений: " + map);

        // 6️⃣ Перебор элементов
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (map.containsKey(name)) {
            System.out.println("Найдено: ");
        } else {
            System.out.println("Не найдено");
        }

        // Task 3

        printUnderage(map);
    }

    public static void printUnderage (Map < String, Integer > map){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " — " + entry.getValue() + " лет");
            }
        }
    }

}
