package org.example.practicinghardskills.thirdSetOfTasks;

public class University {
    private static String universityName;
    private final int studentID;
    private String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }


    public static void changeUniversityName(String newName){
        universityName = newName;
    }

    public void printStudentInfo(){
        System.out.println("студент: " + studentName + " университет: " + universityName);
    }

}
