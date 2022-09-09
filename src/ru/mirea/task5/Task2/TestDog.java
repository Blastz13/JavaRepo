package ru.mirea.task5.Task2;

import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name, age: ");
        Poodle poodle = new Poodle(scanner.next(), scanner.nextInt());
        System.out.println(poodle);

        System.out.println("Input name, age, color: ");
        Dachshund dachshund = new Dachshund(scanner.next(), scanner.nextInt(), scanner.next());
        System.out.println(dachshund);
    }
}
