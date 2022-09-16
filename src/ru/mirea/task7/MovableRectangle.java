package ru.mirea.task7;

public class MovableRectangle implements Movable {
    MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();
    }

    @Override
    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public String toString() {
        return "MovableRectangle: " +
                "topLeft point=" + topLeft +
                ", bottomRight point=" + bottomRight;
    }
}
