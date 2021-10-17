package ru.mirea.task8.var1;

public abstract class Shape {
    private String color;
    private int position;
    public abstract void setColor(String color);
    public abstract void setPosition(int position);
    public abstract String getColor();
    public abstract int getPosition();
}