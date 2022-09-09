package ru.mirea.task5.Test1;

public class Spoon extends Dish{
    private String color;

    public Spoon(String size, String material, String color) {
        super(size, material);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Spoon: " + " Size: " + getSize() + " Material: " + getMaterial() + " Color: " + getColor();
    }
}