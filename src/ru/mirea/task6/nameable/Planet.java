package ru.mirea.task6.nameable;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) { this.name = name; }

    public String getName() { return name; }
}