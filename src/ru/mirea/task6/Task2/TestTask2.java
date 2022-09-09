package ru.mirea.task6.Task2;

public class TestTask2 {
    public static void main(String[] args) {
        Chair chair = new Chair(780);
        PC pc = new PC(123213);
        System.out.println(chair.getPrice());
        System.out.println(pc.getPrice());
    }
}