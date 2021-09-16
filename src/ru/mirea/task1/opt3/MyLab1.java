package ru.mirea.task1.opt3;

public class MyLab1 {

    public static void main(String[] args) {
        System.out.println("Вариант 1");
        Array a1 = new Array();
        System.out.println("Вариант 2");
        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
        System.out.println("Вариант 3");
        Harmonic h1 = new Harmonic();
        System.out.println("Вариант 4");
        a1.sort();
        System.out.println("\nВариант 5");
        h1.factorial();

    }
}