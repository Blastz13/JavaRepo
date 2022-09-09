package ru.mirea.task5.Test3;

public class Sofa extends Furniture {
    private String style;

    public Sofa(String color, String material, float price, String style) {
        super(color, material, price);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Table: " + "Size: " + getStyle() + " Color: " + getColor() + " Material: " + getMaterial();
    }
}
