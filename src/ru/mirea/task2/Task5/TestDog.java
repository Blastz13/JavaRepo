package ru.mirea.task2.Task5;

import ru.mirea.task2.Task4.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {
    ArrayList<Dog> list_dogs = new ArrayList<Dog>(0);

    public void addDogs(){
        String name;
        int age, count_dogs;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input count dogs: ");
        count_dogs = scanner.nextInt();

        System.out.println("Input name and age: ");
        for(int i = 0; i < count_dogs; i++){
            name = scanner.next();
            age = scanner.nextInt();
            list_dogs.add(new Dog(name,age));
        }
    }

    public void showDogs(){
        for (Dog dog: list_dogs) {
            System.out.println(dog.toString());
        }
    }
}
