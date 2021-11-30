package ru.mirea.task26;

public class Account extends CustomerStrategy {

    Account() {
        sum = 0;
        percents = 0;
    }

    Account(int sum, float percents) {
        this.sum = sum;
        this.percents = percents;
    }

    @Override
    public void addPercents() {
        System.out.println("Начисление процентов по обычному счёту не предусмотрено.");
    }

}
