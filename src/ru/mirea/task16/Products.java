package ru.mirea.task16;

public enum Products {
    Deposit(1), Credit(2), Mortgage(3), Savings(4), Account(5), Insurance(6), Investment(7), Card(8);
    private int num;
    int getNum() { return num; }
    Products(int num) { this.num = num; }
}