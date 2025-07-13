package org.example.practicinghardskills.practice_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsTasks {
    public static void main(String[] args) throws InvalidAgeException, InvalidEmailException {
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            System.out.println("открыт файл с именем \"data.txt\"");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }



        divideException(2, 0);
        try{
            validateAge(145);
            validateAge(151);
            validateAge(149); // doesn't work
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        validateEmail("@");

        try{
            validateEmail("@");
            validateEmail("345678");
            validateEmail("dsofosdf");
            validateEmail("@"); // doesn't work
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void divideException(int a, int b){
        try {
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e){
                System.out.println("Error");
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
            if (age < 0 || age > 150){
                throw new InvalidAgeException("Age is Invalid");
            }
            System.out.println("Age is valid: " + age);
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")){
            throw new InvalidEmailException("email is Invalid");
        }
        System.out.println("email is valid: " + email);
    }
}
