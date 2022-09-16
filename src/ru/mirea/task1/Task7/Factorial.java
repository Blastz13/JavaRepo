package ru.mirea.task1.Task7;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = input.nextInt();

        if (number > 0)
            System.out.println(getFactorial(number));
        else
            System.out.println("Ошибка, число должно быть больше 0");
    }

    public static BigInteger getFactorial(long f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
