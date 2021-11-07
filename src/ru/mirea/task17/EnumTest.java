package ru.mirea.task17;
import java.util.Scanner;

enum BankProducts {
    Deposit(1), Credit(2), Mortgage(3), Savings(4), Account(5), Insurance(6), Investment(7), Card(8);
    private int num;
    int getNum() { return num; }
    BankProducts(int num) { this.num = num; }
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
                7 - Открыть инвестиционный счёт
                8 - Выпустить карту""");
        int n = scanner.nextInt();
        product3 = switch (n) {
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
        System.out.println("Ваши продукты:\n" +
                "1 - " + product1.name() +
                "\n2 - " + product2.name());
        if (product3 != null)
            System.out.println("3 - " + product3.name());

        System.out.println("\nЗначения всех enum и номеров операций: " +
                BankProducts.Deposit + " (" + BankProducts.Deposit.getNum() + "), " +
                BankProducts.Credit + " (" + BankProducts.Credit.getNum() + "), " +
                BankProducts.Mortgage + " (" + BankProducts.Mortgage.getNum() + "), " +
                BankProducts.Savings + " (" + BankProducts.Savings.getNum() + "), " +
                BankProducts.Account + " (" + BankProducts.Account.getNum() + "), " +
                BankProducts.Insurance + " (" + BankProducts.Insurance.getNum() + "), " +
                BankProducts.Investment + " (" + BankProducts.Investment.getNum() + "), " +
                BankProducts.Card + " (" + BankProducts.Card.getNum() + ")");
        System.out.println("\nКонстанты:");
        for (BankProducts product : BankProducts.values()) {
            System.out.println(product + " " + product.ordinal());
        }
        if (product3 == null) return; //throw new Exception("NullPointer");
        if (product1.equals(product3) | product2.equals(product3)) {
            System.out.println("\nequals()");
        }
        if (product1 == product3 | product2 == product3) {
            System.out.println("сравнение");
        }
        if (product1.compareTo(product3) == 0 | product2.compareTo(product3) == 0) {
            System.out.println("compareTo()");
        }
    }
}