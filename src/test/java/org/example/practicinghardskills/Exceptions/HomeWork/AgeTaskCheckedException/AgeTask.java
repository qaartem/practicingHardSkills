package org.example.practicinghardskills.Exceptions.HomeWork.AgeTaskCheckedException;


public class AgeTask {
    public static void main(String[] args) {
        try {
            ageValidation(50);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ageValidation(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age should be from 0 to 150");
        }

        System.out.println(age);
    }

}
