package ru.mirea.task25;

public class Account implements Service {
    protected float value = 65057.10f;

    @Override
    public float getValue() {
        return value;
    }

}
