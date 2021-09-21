package ru.mirea.task4.ball;

public class Ball {
    private double x, y;

    public Ball() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Ball(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x = xDisp;
        y = yDisp;
    }

    public String toString() {
        return "X location: " + x + ", Y location: " + y;
    }
}