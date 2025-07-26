package org.example.practicinghardskills.Generics;

public class Box <T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static <T> void printArray(T[] array){
        for(T item: array){
            System.out.println(item);
        }
    }


}
