package ru.mirea.task1.Task6;

public class MassiveOfRands {
    public static void main(String[] args){
        int max = 10;
        int min = 1;
        int[] array = new int [(int) ((Math.random() * ((max - min) + 1)) + min)];
        System.out.println("Init Array: ");

        for(int i = 0; i < array.length;i++) {
            array[i] = (int)(Math.random()*100);
        }
        printArray(array);

        System.out.println("\nSorted Array: ");
        sortArray(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static int[] sortArray(int[] array) {
        for (int i=0; i<array.length; i++) {
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