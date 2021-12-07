package ru.mirea.task25;

public class Decorator extends Deposit {
    protected float percent = 0.42f;

    public float getPercent() {
        return percent;
    }

    @Override
    public float getValue() {
        return value;
    }
}
