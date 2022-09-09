package ru.mirea.task6.Task2;

public class PC implements Priceable {
    private int price;

    public PC(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
