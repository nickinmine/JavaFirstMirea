package ru.mirea.task25;

public class Deposit implements Service {
    protected float value = 98724.42f;
    protected float percent = 0.45f;

    @Override
    public float getValue() {
        return value;
    }

}
