package ru.mirea.task2;

public class Ball {
    public int xLocation;
    public int yLocation;

    public Ball() {
        this.xLocation = 0;
        this.yLocation = 0;
    }

    public Ball(int xLocation, int yLocation) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public int GetXLocation() {
        return xLocation;
    }

    public int GetYLocation() {
        return yLocation;
    }
}
