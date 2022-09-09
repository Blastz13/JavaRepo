package ru.mirea.task6.Task2;

public class Chair implements Priceable {
    private int price;

    public Chair(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
