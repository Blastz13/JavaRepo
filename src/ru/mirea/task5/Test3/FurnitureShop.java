package ru.mirea.task5.Test3;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private Furniture sofa = new Sofa("Red", "Some", 12332, "Hustle");
    private Furniture table = new Table("Gold", "Some", 10000, "Big");
    private Furniture chair = new Chair("Blue", "Some", 50, 5);

    private ArrayList<Furniture> cart;
    private int total_amount;
    private int balance;

    public FurnitureShop() {
        total_amount = 0;
        balance = 0;
        cart = new ArrayList<Furniture>();
    }

    public void getBalance() {
        System.out.println("Balance: " + balance);
    }

    public void addMoney(int money) {
        this.balance += money;
        System.out.println("Balance: " + this.balance);
    }

    public void addToCart() {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number:\n1: Sofa\n2: Table\n3: Chair\n");
        number = in.nextInt();

        switch (number) {
            case 1:
                cart.add(sofa);
                break;
            case 2:
                cart.add(table);
                break;
            case 3:
                cart.add(chair);
                break;
        }
        System.out.println("Added");
    }

    public void showCart() {
        for(Furniture furniture : cart) {
            System.out.println(furniture);
        }
    }

    public void clearCart() {
        cart.clear();
    }

    public void removeFromCart() {
        showCart();
        Scanner in = new Scanner(System.in);
        System.out.print("Input what to delete: ");
        cart.remove(in.nextInt() - 1);
    }

    public void createOrder() {
        if (balance >= total_amount) {
            balance -= total_amount;
            System.out.println("Success: ");
            showCart();
            total_amount = 0;
            cart.clear();
        } else {
            System.out.println("Total: " + total_amount + ". Not enough money.");
        }
    }
}