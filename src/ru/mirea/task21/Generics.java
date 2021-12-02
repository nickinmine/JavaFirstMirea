package ru.mirea.task21;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("Текст");
        String text = list1.get(0) + " без исключения";
        System.out.println(text + "\n");

        try {
            List list2 = new ArrayList();
            list2.add("Текст");
            list2.add(123);
            for (Object str : list2) {
                System.out.println((String) str);
            }
        } catch (Exception e) {
            System.out.println("Вызвано исключение приведения типов данных\n" + e);
        }

        List<String> list3 = new ArrayList<>();
        list3.add("Текст");
        //list3.add(123); будет ошибка компиляции
        for (Object str : list3) {
            System.out.println(str);
        }
    }
}