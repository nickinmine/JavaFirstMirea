package ru.mirea.task7.movable;

public class MovableRectangle implements Movable {

    private MovablePoint first, second;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        first = new MovablePoint(x1, y1, xSpeed, ySpeed);
        second = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() { return "Rectangle first: " + first + ", second: " + second; }

    @Override
    public void moveUp() {
        first.moveUp();
        second.moveUp();
    }

    @Override
    public void moveDown() {
        first.moveDown();
        second.moveDown();
    }

    @Override
    public void moveLeft() {
        first.moveLeft();
        second.moveLeft();
    }

    @Override
    public void moveRight() {
        first.moveRight();
        second.moveRight();
    }
}