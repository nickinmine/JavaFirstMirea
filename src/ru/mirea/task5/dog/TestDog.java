package ru.mirea.task5.dog;
import java.util.Scanner;
public class TestDog {
    public int size;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shepherd dog1 = new Shepherd();
        Terrier dog2 = new Terrier();
        dog1.setSize(70);
        dog2.setSize(scanner.nextInt());
        System.out.println("Shepherd, " + dog1.toString());
        System.out.println("Terrier, " + dog2.toString());
    }
}