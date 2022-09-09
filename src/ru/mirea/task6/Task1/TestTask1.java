package ru.mirea.task6.Task1;

import ru.mirea.task6.Task1.Car;

public class TestTask1 {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth");
        Car car = new Car("Petrol");
        Dog dog = new Dog("Alfa");
        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(dog.getName());
    }
}