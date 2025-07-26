package org.example.practicinghardskills.Exceptions.HomeWork;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTask {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            System.out.println("File is opened");
        } catch (FileNotFoundException e) {
            System.out.println("File is not opened");
            e.printStackTrace();
        }
        System.out.println("Program is working");
    }

}
