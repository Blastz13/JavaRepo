package ru.mirea.task1.Task5;

public class HarmonicSeries {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double number = 1 / (double) i;
            System.out.print(String.format("%.5f", number) + " ");
        }
    }
}
