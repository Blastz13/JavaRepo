package ru.mirea.task7;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square: " +
                "side=" + width +
                ", color=" + color +
                ", is filled=" + filled;
    }
}
