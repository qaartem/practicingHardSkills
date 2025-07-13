package org.example.practicinghradskills.fourthSetOfTasks;

public enum Planet {
    MERCURY(1, 23),VENUS(2, 234), EARTH(3,43534), MARS(4, 453), JUPITER(5, 697567), SATURN(6, 5678), URANUS(7, 796079), NEPTUNE(8, 965);

    private final int number;
    private final double mass;

    Planet(int number, double mass) {
        this.number = number;
        this.mass = mass;
    }

    public int getNumber() {
        return number;
    }

    public double getMass() {
        return mass;
    }
}
