package ru.mirea.task5.Test3;

public abstract class Furniture {
    private String color;
    private String material;
    private float price;

    public Furniture(String color, String material, float price) {
        this.color = color;
        this.material = material;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public abstract String toString();
}