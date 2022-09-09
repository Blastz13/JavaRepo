package ru.mirea.task5.Task2;

public class Dachshund extends Dog {
    private String color;

    public Dachshund(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dachshund name is " + getName() + ", he is " + getAge() + " y.o " + " Color: " + getColor();
    }
}
