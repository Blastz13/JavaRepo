package ru.mirea.task3.Task1;

public class TestCircle {
    public static void main(String []args) {
        Circle circle=new Circle(12,10,2);
        System.out.println("Old coordinate: " + circle.getX() + " " + circle.getY());
        System.out.println("Old radius : "+ circle.getRadius());
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(50);
        System.out.println("New values: " +circle.getX() + " " + circle.getY() + " " + circle.getRadius());
    }
}
