package ru.mirea.task14;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DoubleListTest {
    public static void main(String[] args) {
        int stepsCounter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            list1.add(scanner.nextInt());
        for (int i = 5; i < 10; i++)
            list2.add(scanner.nextInt());

        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (stepsCounter >= 106) {
                System.out.println("botwa");
                break;
            }
            int first = list1.remove(0);
            int second = list2.remove(0);
            if (first == 9 && second == 0) {
                list2.add(first);
                list2.add(second);
            }
            else if (first == 0 && second == 9) {
                list1.add(first);
                list1.add(second);
            }
            else if (first < second) {
                list2.add(first);
                list2.add(second);
            }
            else {
                list1.add(first);
                list1.add(second);
            }
            stepsCounter++;
        }
        if (list1.isEmpty())
            System.out.println("second " + stepsCounter);
        else if (list2.isEmpty())
            System.out.println("first " + stepsCounter);
    }
}