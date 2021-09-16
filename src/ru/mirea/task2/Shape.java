package ru.mirea.task2;

public class Shape {
    private float area;
    private int perimeter;
    private String color;

    public Shape(float area, int perimeter, String color) {
        this.area = area;
        this.perimeter = perimeter;
        this.color = color;
    }

    public String toString() {
        return "area: " + area + ", perimeter: " + perimeter + ", color: " + color;
    }
}