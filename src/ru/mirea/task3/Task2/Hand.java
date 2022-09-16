package ru.mirea.task3.Task2;

public class Hand {
    private int numOfFingers;

    public int getNumOfFingers() {
        return numOfFingers;
    }

    public Hand() {
        numOfFingers = 5;
    }

    public Hand(int n) {
        numOfFingers = n;
    }

    public void setNumOfFingers(int numOfFingers) {
        this.numOfFingers = numOfFingers;
    }

    public void wave() {
        System.out.println("*waving hand*");
    }

    public void clap() {
        System.out.println("*clap*");
    }

    public void info() {
        System.out.println("This hand has " + numOfFingers + " fingers");
    }
}