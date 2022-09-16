package ru.mirea.task2.Task2;

public class Ball {
    private String color, size;

    public Ball(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "Ball: Size: " + getSize() + ", Color: " + getColor();
    }
}