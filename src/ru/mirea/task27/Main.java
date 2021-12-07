package ru.mirea.task27;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4575447, "Арбузов Валерий");
        map.put(5465432, "Махалов Андрей");
        map.put(8474534, "Чкалов Антон");
        map.put(5643435, "Зуев Алексей");
        map.put(8745465, "Климова Анастасия");
        map.put(8676845, "Южин Сергей");
        map.put(3867812, "Николаева Злата");
        System.out.print("Введите номер счёта и имя клиента: ");
        map.put(scanner.nextInt(), scanner.nextLine());
        System.out.println(map);
        System.out.print("Введите номер счёта клиента для вывода его имени: ");
        System.out.println(map.get(scanner.nextInt()));
        System.out.print("Введите номер счёта клиента, которого необходимо исключить: ");
        System.out.println(map.remove(scanner.nextInt()));
        System.out.println(map);
        System.out.print("Введите номер счёта клиента для проверки его наличия в базе: ");
        System.out.println(map.containsKey(scanner.nextInt()));
        System.out.print("Введите имя клиента для проверки его наличия в базе: ");
        System.out.println(map.containsValue(scanner.nextLine()));
        System.out.println("Количество записей в базе: " + map.size());
    }
}
