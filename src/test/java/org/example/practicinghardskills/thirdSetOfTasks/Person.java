package org.example.practicinghradskills.thirdSetOfTasks;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String ssn, String firstName, String lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSsn() {
        return ssn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo(){
        System.out.println("Имя: " + firstName + " Фамилия: " + lastName + " SSN: " + ssn);
    }
}
