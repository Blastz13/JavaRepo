package ru.mirea.task10;

import java.util.Scanner;

public class Recursion {
    public static int digitSum(int number) {
        return (number == 0)
                ? 0
                : (number % 10) + digitSum(number / 10);
    }

    public static boolean isEasyNumber(int n, int i) {

        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return isEasyNumber(n, i + 1);
        } else {
            return true;
        }
    }

    public static int recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void separate(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            separate(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            separate(n, ++k);
        }
    }
    public static void main(String[] args) {
        System.out.println(digitSum(135));
        System.out.println(isEasyNumber(9, 2));
        System.out.println(recursion(0, 0, 3, 15));
        separate(6, 2);
    }
}
