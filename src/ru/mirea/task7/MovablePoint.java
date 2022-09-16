package ru.mirea.task7;

public class MovablePoint implements Movable {
    private int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: " +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed;
    }

    @Override
    public void moveDown() {
        ySpeed -= 1;
    }

    @Override
    public void moveLeft() {
        xSpeed -= 1;
    }

    @Override
    public void moveRight() {
        xSpeed += 1;
    }

    @Override
    public void moveUp() {
        ySpeed += 1;
    }
}
