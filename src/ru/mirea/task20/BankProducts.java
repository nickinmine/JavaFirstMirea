package ru.mirea.task20;

public enum BankProducts {
    Deposit(1), Credit(2), Mortgage(3), Savings(4), Account(5), Insurance(6), Investment(7), Card(8);
    private int num;
    int getNum() { return num; }
    BankProducts(int num) { this.num = num; }
}