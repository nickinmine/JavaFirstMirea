package ru.mirea.task5.dog;

public abstract class Dog {
    private int size;

    public Dog() { this.size = 0; }

    public void setSize(int size) { this.size = size; }

    public int getSize() { return size; }

    public String toString() { return "size: " + size; }
}
