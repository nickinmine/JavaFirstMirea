package ru.mirea.task2;
import java.lang.*;
import java.security.PrivateKey;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        this.name = "";
        this.age = 0;
        //System.out.println(name);
        //System.out.println(age);
    }

    public Dog(int age) {
        this.name = "";
        this.age = age;
        //System.out.println(name);
        //System.out.println(age);
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
        //System.out.println(name);
        //System.out.println(age);
    }

    public Dog(int age, String name) {
        this.name = name;
        this.age = age;
        //System.out.println(name);
        //System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
        return;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + ", age: " + age;
    }

    public int dogAgeToManAge() {
        return age * 7;
    }
}
