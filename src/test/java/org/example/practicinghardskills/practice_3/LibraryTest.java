package org.example.practicinghardskills.practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.setBookTitle("The Hobbit");
        lib.setAuthor("author");
        lib.setCategory("category");
        lib.setYear(2017);
        System.out.println(lib.getBookTitle());
        System.out.println(lib.getAuthor());
        System.out.println(lib.getCategory());
        System.out.println(lib.getYear());

    }

}
