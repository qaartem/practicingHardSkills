package org.example.practicinghardskills.Exceptions;

import java.io.FileNotFoundException;

public class FileReader {

    public static void main(String[] args) {
        try {
            java.io.FileReader reader = new java.io.FileReader("data.txt");
            System.out.println("Файл успешно открыт.");
            System.out.println("Текущая директория: " + System.getProperty("user.dir"));

        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден.");
            e.printStackTrace();
        }
        System.out.println("Program is ended");
    }
}
