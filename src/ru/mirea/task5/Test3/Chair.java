package ru.mirea.task5.Test3;

public class Chair extends Furniture{
    private Integer cuntLegs;

    public Chair(String color, String material, float price, int cuntLegs){
        super(color, material, price);
        this.cuntLegs = cuntLegs;
    }

    public Integer getCuntLegs() {
        return cuntLegs;
    }

    @Override
    public String toString() {
        return "Chair: Price: " + getPrice() + " Color: " + getColor() + " Material: "
                + getMaterial() + "Count legs:" + getCuntLegs();
    }
}
