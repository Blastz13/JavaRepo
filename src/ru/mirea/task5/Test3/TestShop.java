package ru.mirea.task5.Test3;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args){
        FurnitureShop shop = new FurnitureShop();
        Scanner in = new Scanner(System.in);
        String menu = "1: Add to cart\n2: Remove from cart\n3: Clear cart\n4: Confirm order\n5: Show cart\n" +
                "6: Show balance\n7: Add money\n9: Leave shop";
        boolean isRun = true;
        while (isRun) {
            System.out.println(menu);

            switch (in.nextInt()) {
                case 1:
                    shop.addToCart();
                    break;
                case 2:
                    shop.removeFromCart();
                    break;
                case 3:
                    shop.clearCart();
                    break;
                case 4:
                    shop.createOrder();
                    break;
                case 5:
                    shop.showCart();
                    break;
                case 6:
                    shop.getBalance();
                    break;
                case 7:
                    System.out.println("Add money:");
                    shop.addMoney(in.nextInt());
                    break;
                case 9:
                    isRun = false;
                    break;
            }
        }
    }
}