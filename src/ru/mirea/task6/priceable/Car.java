package ru.mirea.task6.priceable;

public class Car implements Priceable{
    private float price;

    public Car(float price) { this.price = price; }

    public float getPrice() { return price; }
}