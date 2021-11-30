package ru.mirea.task26;

public class Deposit extends CustomerStrategy {

    Deposit() {
        sum = 0;
        percents = 0;
    }

    Deposit(int sum, float percents) {
        this.sum = sum;
        this.percents = percents;
    }

    public void up(int sum) {
        this.sum += sum;
    }

}
