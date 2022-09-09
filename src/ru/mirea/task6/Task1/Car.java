package ru.mirea.task6.Task1;

public class Car implements Nameable {
    private String type;

    public Car(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return "Car is type: " + getType();
    }
}