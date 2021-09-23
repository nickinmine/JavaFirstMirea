package ru.mirea.task6.priceable;
import java.util.Scanner;
public class Test implements Priceable {
    private float price = 0.0f;
    public float getPrice() { return price; }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getPrice());
        Scanner scanner = new Scanner(System.in);
        Car car2 = new Car(scanner.nextFloat());
        System.out.println(car2.getPrice());
        Car car1 = new Car(265583.98f);
        System.out.println(car1.getPrice());

    }
}
