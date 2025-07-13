package org.example.practicinghardskills.practice_8.generics;
class Task9 implements Container<String>{
    private String task;

    public String get() {
        return task;
    }

    public void add(String task) {
        this.task = task;
    }

    public static void main(String[] args) {
        Container<String> strings = new Task9();
        strings.add("String");
        System.out.println(strings.get());

    }


}
