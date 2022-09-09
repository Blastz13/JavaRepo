package ru.mirea.task2.Task1;

public class TestShape {
    public static void main(String []args) {
        Shape shape = new Shape("Triangle");
        System.out.println(shape.toString());
        Shape shape2 = new Shape("Square");
        System.out.println(shape2.toString());
        Shape shape3 = new Shape("Circle");
        System.out.println(shape3.toString());
    }
}
