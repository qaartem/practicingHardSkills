package org.example.practicinghardskills.Exceptions.HomeWork.EmailTaskUncheckedException;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message){
        super(message);
    }
}
