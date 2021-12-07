package ru.mirea.task25;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Decorator deposit = new Decorator();
        System.out.println("Остаток по счёту: " + account.getValue());
        System.out.println("Остаток по вкладу: " + deposit.getValue());
        System.out.println("Процент по вкладу: " + deposit.getPercent()*10 + "%");
        System.out.println("Процент по счёту не предусмотрен!");
    }
}
