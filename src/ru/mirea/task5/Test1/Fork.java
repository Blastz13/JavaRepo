package ru.mirea.task5.Test1;

public class Fork extends Dish {
    private Integer numberTeeth;

    public Fork(String size, String material, Integer numberTeeth) {
        super(size, material);
        this.numberTeeth = numberTeeth;
    }

    public Integer getNumberTeeth() {
        return numberTeeth;
    }

    @Override
    public String toString() {
        return "This Fork is " + getSize() + " have " + getNumberTeeth() + " teeth, made of " + getMaterial();
    }
}