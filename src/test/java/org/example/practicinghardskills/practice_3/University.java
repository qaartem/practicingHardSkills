package org.example.practicinghardskills.practice_3;

public class University {
    private static String universityName;
    private final int studentID;
    private String studentName;

    public University(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;

    }

    public static void changeUniversityName(String newName){
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo(){
        System.out.println(studentName + " " + studentID + " " + universityName);
    }

    public static void main(String[] args) {
        University student1 = new University("Michael Brown", 1);
        University student2 = new University("Artem Brown", 2);
        University student3 = new University("Alex Brown", 3);

        University.universityName = "University Name";
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
