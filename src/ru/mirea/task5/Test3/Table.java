package ru.mirea.task5.Test3;

public class Table extends Furniture {
    private String size;

    public Table(String color, String material, float price, String size) {
        super(color, material, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Table: " + "Size: " + getSize() + " Color: " + getColor() + " Material: " + getMaterial();
    }
}
