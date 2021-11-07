package ru.mirea.task17;
import java.util.Scanner;

enum BankProducts {
    Deposit, Credit, Mortgage, Savings, Account, Insurance, Investment
}

public class EnumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankProducts product1 = BankProducts.Account;
        BankProducts product2 = BankProducts.Savings;
        BankProducts product3;
        System.out.println("""
                Банк предлагает Вам открыть новый продукт:
                0 - Не открывать новый продукт
                1 - Взять кредит
                2 - Открыть вклад
                3 - Взять ипотеку
                4 - Открыть накопительный счёт
                5 - Открыть обычный счёт
                6 - Купить страховку
                7 - Открыть инвестиционный счёт""");
        int n = scanner.nextInt();
        product3 = switch (n) {
            case 1 -> BankProducts.Credit;
            case 2 -> BankProducts.Deposit;
            case 3 -> BankProducts.Mortgage;
            case 4 -> BankProducts.Savings;
            case 5 -> BankProducts.Account;
            case 6 -> BankProducts.Insurance;
            case 7 -> BankProducts.Investment;
            default -> null;
        };
        System.out.println("Ваши продукты:\n" +
                "1 - " + product1.name() +
                "\n2 - " + product2.name());
        if (product3 != null)
            System.out.println("3 - " + product3.name());

    }
}