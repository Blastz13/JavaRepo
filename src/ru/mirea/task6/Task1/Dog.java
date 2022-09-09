package ru.mirea.task6.Task1;

import ru.mirea.task6.Task1.Nameable;

public class Dog implements Nameable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}