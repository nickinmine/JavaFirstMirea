package ru.mirea.task10.var10;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
        System.out.println(reverse(n));
    }

    static int reverse(int num) {
        return reverse(num, (int) Math.pow(10, Math.ceil(Math.log10(num)) - 1));
    }

    static int reverse(int n, int m) {
        return (n != 0) ? (n / m) + reverse(n % m, m / 10) * 10 : 0;
    }
}