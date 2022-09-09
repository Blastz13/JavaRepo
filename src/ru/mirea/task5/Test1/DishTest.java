package ru.mirea.task5.Test1;

import java.util.Scanner;

public class DishTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fork: ");
        System.out.println("Input size, material and count teeth");
        Fork fork = new Fork(scanner.next(), scanner.next(), scanner.nextInt());
        System.out.println(fork);

        System.out.println("Spoon: ");
        System.out.println("Input size, material and color");
        Spoon spoon = new Spoon(scanner.next(), scanner.next(), scanner.next());
        System.out.println(spoon);
    }
}