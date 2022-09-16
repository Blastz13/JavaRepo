package ru.mirea.task1.Task6;

import java.util.Random;

public class MassiveOfRandsAlternative {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1 + random.nextInt(10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Init Array: ");
        printArray(array);

        System.out.println("\nSorted Array: ");
        sortArray(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}