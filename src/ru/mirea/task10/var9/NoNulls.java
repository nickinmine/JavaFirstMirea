package ru.mirea.task10.var9;
import java.util.Scanner;
public class NoNulls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(counter(a, b));
    }

    public static int counter(int a, int b) {
        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;
        return counter(a,b-1) + counter(a-1, b-1);
    }
}
