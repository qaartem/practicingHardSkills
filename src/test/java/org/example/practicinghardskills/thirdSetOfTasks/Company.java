package org.example.practicinghardskills.thirdSetOfTasks;

public class Company {
    private static String companyName;
    private final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }

    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    public static String getCompanyName() {
        return companyName;
    }




}
