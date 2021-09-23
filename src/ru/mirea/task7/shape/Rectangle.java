package ru.mirea.task7.shape;

public class Rectangle extends Shape {
    double height, width;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, Boolean filled) {
        this(width, height);
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public String toString() {
        return "Rectangle: w=" + width + ", h=" + height + ", color=" + color + ", " + (filled ? "is" : "isn't")
                + " filled";
    }
}
