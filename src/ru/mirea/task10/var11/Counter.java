package ru.mirea.task10.var11;
import java.util.Scanner;
public class Counter {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(countOfOne());
    }

    static int countOfOne() {
        return countOfOne(0, 0);
    }

    static int countOfOne(int cnt, int zerocnt) {
        if (zerocnt == 2)
            return cnt;
        else {
            int n = scanner.nextInt();
            if (n == 0)
                zerocnt++;
            else
                zerocnt = 0;
            if (n == 1)
                cnt++;
            return countOfOne(cnt, zerocnt);
        }
    }
}
