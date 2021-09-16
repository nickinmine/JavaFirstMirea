package ru.mirea.task1.opt3;
import java.util.Scanner;
public class Harmonic {
    private double sum = 0f;
    Harmonic() {
        for (int i = 1; i < 11; i++) {
            sum += (1 / (double)i);
            System.out.print((1 / (double)i) + " ");
        }
        System.out.println("\nСумма первых 10 элементов гармонического ряда: " + sum);
    }

    public void factorial() {
        System.out.print("Введите число: ");
        Scanner reader = new Scanner(System.in);
        int sum = 1, n = reader.nextInt();
        for (int i = n; i > 0; i--) {
            sum *= i;
        }
        System.out.print("Факториал числа "+ n + ": " + sum);
    }
}