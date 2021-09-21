package ru.mirea.task4.ball;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double x = cin.nextDouble(), y = cin.nextDouble();
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(x, y);
        x = cin.nextDouble();
        y = cin.nextDouble();
        ball1.setXY(x, y);
        ball2.move(x, y);

        System.out.println(ball1.getX() + " " + ball1.getY());
        System.out.println(ball2.toString());
    }
}
