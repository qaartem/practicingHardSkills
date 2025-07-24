package org.example.practicinghardskills.collections.HomeWork;

import java.util.Arrays;
import java.util.LinkedHashSet;


public class LinkedHashSetTasks {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>(Arrays.asList("string1", "string2", "string3", "string4", "string5"));
        strings.add("7");
        strings.add("6");

        addUnique(strings, "8");
        addUnique(strings, "7");
        System.out.println(strings);
    }

    public static void addUnique(LinkedHashSet<String> strings, String element) {
        if (!strings.contains(element)) {
            strings.add(element);
        }

    }

}
