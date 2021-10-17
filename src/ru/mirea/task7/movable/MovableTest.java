package ru.mirea.task7.movable;

public class MovableTest {

    public static void main(String[] args) {

        MovableCircle obj1 = new MovableCircle(1, 1, 2, 1, 3);
        System.out.println(obj1.toString());
        obj1.moveRight();
        System.out.println(obj1.toString());
        obj1.moveUp();
        System.out.println(obj1.toString());
        obj1.moveLeft();
        System.out.println(obj1.toString());

        MovableRectangle obj2 = new MovableRectangle(0,1,2,4,1,1);
        System.out.println(obj2.toString());
        obj2.moveLeft();
        System.out.println(obj2.toString());
        obj2.moveDown();
        System.out.println(obj2.toString());
        obj2.moveRight();
        System.out.println(obj2.toString());
    }
}
