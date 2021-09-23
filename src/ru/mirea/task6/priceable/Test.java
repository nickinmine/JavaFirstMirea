package ru.mirea.task6.priceable;

public class Test implements Priceable {
    private float price = 0.0f;
    public float getPrice() { return price; }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getPrice());
        Car car = new Car(265583.98f);
        System.out.println(car.getPrice());
    }
}
