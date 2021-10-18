package ru.mirea.task13;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyList<Integer> arr = new MyList<>();
        System.out.print("Введите кол-во добавляемых значений: ");
        for (int i = scanner.nextInt(); i>0; i--) {
            System.out.print("Введите значение: ");
            arr.add(scanner.nextInt());
        }
        System.out.print("Введите номер значения, которое хотите увидеть: ");
        System.out.println("Значение: " + arr.get(scanner.nextInt()));
        System.out.print("Все значения: ");
        for (int x: arr) {
            System.out.print(x + " ");
        }
        System.out.print("\nВведите номер значения, которое хотите удалить: ");
        arr.remove(scanner.nextInt());
        System.out.print("Все значения: ");
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
}