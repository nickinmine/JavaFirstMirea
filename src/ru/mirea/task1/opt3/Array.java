package ru.mirea.task1.opt3;

public class Array {
    private int arr[] = new int[10];

    Array() {
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random()*10) + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nСумма чисел массива циклом for: " + sumCounterFor());
        System.out.println("Сумма чисел массива циклом while: " + sumCounterWhile());
        System.out.println("Сумма чисел массива циклом do while: " + sumCounterDoWhile());
    }

    public int sumCounterFor() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int sumCounterWhile() {
        int sum = 0, i = 0;
        while (true) {
            sum += arr[i];
            i++;
            if (i >= 10) {
                break;
            }
        }
        return sum;
    }

    public int sumCounterDoWhile() {
        int sum = 0, i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < 10);
        return sum;
    }

    public void sort() {
        int replace;
        System.out.print("Отсортированный массив из 1 варианта: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    replace = arr[i];
                    arr[i] = arr[j];
                    arr[j] = replace;
                }
            }
            //System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}