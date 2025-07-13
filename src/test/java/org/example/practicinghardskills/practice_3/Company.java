package org.example.practicinghardskills.practice_3;

public class Company {
    static String companyName;
    private final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName(){
        System.out.println("companyName: " + companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Company.companyName = companyName;
    }

    public static void main(String[] args) {
        Company employee = new Company(12345, "John Smith");
        Company employee2 = new Company(12346, "John Worker");
        Company.companyName = "Linux";
        printCompanyName();
        System.out.println(employee.employeeName + ", Company name: " + employee.companyName);
        System.out.println(employee2.employeeName + ", Company name: " + employee2.companyName);

    }
}
