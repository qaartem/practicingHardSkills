package org.example.practicinghardskills.constructors;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void print(){
        System.out.println("Координаты: x = " + x + " ," + "y = " + y);
    }
}
