package org.example.practicinghardskills.Exceptions.HomeWork.EmailTaskUncheckedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailTask {
    public static void main(String[] args) {
        try {
            emailValidation("hello@example.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void emailValidation(String email) {
        Pattern pattern = Pattern.compile("@");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()) {
            throw new InvalidEmailException("email is invalid");
        }

        System.out.println(email);
    }
}
