package ru.mirea.task7.shape;

public class Square extends Rectangle {
    public Square() {
        this(1.0);
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(double side, String color, Boolean filled) {
        this(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = this.height = side;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setHeight(double side) {
        setSide(side);
    }

    public String toString() {
        return "Square: side=" + getSide() + ", color=" + color + ", " + (filled ? "is" : "isn't") + " filled";
    }
}