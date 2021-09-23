package ru.mirea.task3.human;

public class LeftLeg {
    private boolean broken;
    private float size;
    public LeftLeg(float size) {
        this.broken = false;
        this.size = size;
    }

    public void brakeOrgan() { this.broken = true; }
    public boolean isBraked() { return broken; }
    public float getSize() { return size; }
}