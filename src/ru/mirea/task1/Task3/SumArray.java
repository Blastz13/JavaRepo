package ru.mirea.task1.Task3;

public class SumArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        System.out.println("FOR");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        sum = 0;
        System.out.println("WHILE");
        int j = 0;
        while (j < array.length) {
            sum += array[j];
            j++;
        }
        System.out.println(sum);

        sum = 0;
        System.out.println("DO WHILE");
        j = 0;
        do {
            sum += array[j];
            j++;
        } while (j < array.length);
        System.out.println(sum);
    }
}

