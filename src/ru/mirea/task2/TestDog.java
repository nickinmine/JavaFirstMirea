package ru.mirea.task2;
import java.lang.*;
public class TestDog {

    public static void main(String[] args) {
        Dog pop = new Dog();
        Dog quo = new Dog("Quo");
        Dog joe = new Dog(3,"Joe");
        System.out.println(joe.toString());
        System.out.println(joe.dogAgeToManAge());

        Shape obj = new Shape(5613.15f,656, "red");
        System.out.println(obj.toString());

        Ball ball1 = new Ball();
        Ball ball2 = new Ball(2, 5);
        Book book1 = new Book();
        Book book2 = new Book("Alice in Wonderland");
        Book book3 = new Book("Pet Sematary", 458, 699.99f);

    }
}