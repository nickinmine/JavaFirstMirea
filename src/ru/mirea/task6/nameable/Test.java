package ru.mirea.task6.nameable;

public class Test implements Nameable {

    public String getName() {
        return "Name";
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.getName());
        Car car = new Car("Toyota");
        System.out.println(car.getName());
        Planet planet = new Planet("Earth");
        System.out.println(planet.getName());

    }
}