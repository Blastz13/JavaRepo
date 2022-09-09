package ru.mirea.task2.Task2;

public class TestBall {
    public static void main(String [] args) {
        Ball ball = new Ball("Orange","Big");
        System.out.println(ball);
        ball.setColor("Green");
        ball.setSize("Small");
        System.out.println(ball);
    }
}
