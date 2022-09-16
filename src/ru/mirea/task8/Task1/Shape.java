package ru.mirea.task8.Task1;

import java.awt.Color;

abstract public class Shape {
    protected Color color;
    protected int x = 0;
    protected int y = 0;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}