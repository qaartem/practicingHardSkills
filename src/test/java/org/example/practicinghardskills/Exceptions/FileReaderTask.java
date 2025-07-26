package org.example.practicinghardskills.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTask {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
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
