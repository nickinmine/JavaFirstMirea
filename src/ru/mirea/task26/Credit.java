package ru.mirea.task26;

public class Credit extends CustomerStrategy {

    Credit() {
        sum = 0;
        percents = 0;
    }

    Credit(int sum, float percents) {
        this.sum = sum;
        this.percents = percents;
    }

    public void repay(int sum) {
        this.sum -= sum;
    }

}
