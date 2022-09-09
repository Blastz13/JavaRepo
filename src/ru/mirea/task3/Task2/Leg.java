package ru.mirea.task3.Task2;

public class Leg {
    private int shoeSize;
    public Leg(){
        shoeSize=42;
    }
    public Leg(int size){
        shoeSize=size;
    }
    public int getShoeSize() {
        return shoeSize;
    }
    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
    public void stomp(){
        System.out.println("*stomp*");
    }
    public void info(){
        System.out.println("Shoe size is "+shoeSize);
    }
}