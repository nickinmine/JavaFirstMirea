package ru.mirea.task20;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TimeTest {

    public static String date(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        BankProducts product = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Банк предлагает Вам открыть новый продукт:
                0 - Не открывать новый продукт
                1 - Взять кредит
                2 - Открыть вклад
                3 - Взять ипотеку
                4 - Открыть накопительный счёт
                5 - Открыть обычный счёт
                6 - Купить страховку
                7 - Открыть инвестиционный счёт
                8 - Выпустить карту""");
        int n = scanner.nextInt();
        Date date = new Date();
        product = switch (n) {
            case 1 -> BankProducts.Deposit;
            case 2 -> BankProducts.Credit;
            case 3 -> BankProducts.Mortgage;
            case 4 -> BankProducts.Savings;
            case 5 -> BankProducts.Account;
            case 6 -> BankProducts.Insurance;
            case 7 -> BankProducts.Investment;
            case 8 -> BankProducts.Card;
            default -> null;
        };
        if (product != null)
            System.out.println("Продукт банка " + product + " был открыт в " + date(date));
        Date[] operations = new Date[5];
        operations[0] = new Date(1632061390000L);
        operations[1] = new Date(1633106775000L);
        operations[2] = new Date(1634324475000L);
        operations[3] = new Date(1635801627000L);
        operations[4] = new Date();
        System.out.println("\nИнформация о последних операциях по Вашему счёту:");
        for (int i = 0; i < 5; i++) {
            System.out.println(date(operations[i]));
        }
    }
}