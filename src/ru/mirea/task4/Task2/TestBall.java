package ru.mirea.task4.Task2;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball = new Ball();
        ball.move(32,-5);
        System.out.println(ball);
        ball.setXY(3,1);
        System.out.println(ball);
        ball.setXY(6,5);
        System.out.println(ball);
        ball.setX(2);
        ball.setY(2);
        System.out.println(ball);
    }
}