package ru.mirea.task8.Task1;

import java.awt.*;

public class Rectangle extends Shape {
    private int width = 200;
    private int height = 100;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
