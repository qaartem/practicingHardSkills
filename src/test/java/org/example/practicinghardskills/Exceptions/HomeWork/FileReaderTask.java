package org.example.practicinghardskills.Exceptions.HomeWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTask {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt")) {
            System.out.println("File is opened");
            // Здесь можно читать содержимое файла, если нужно
        } catch (FileNotFoundException e) {
            System.out.println("File is not opened - not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File could not be read");
            e.printStackTrace();
        }
        System.out.println("Program is working");
    }

}
