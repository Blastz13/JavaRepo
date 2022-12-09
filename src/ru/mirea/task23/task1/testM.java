package ru.mirea.task23.task1;

public class testM {
    public static void main(String[] args) {
        new ArrayQModule();
        fill(10);
        System.out.println(ArrayQModule.show());
        System.out.println(ArrayQModule.element());

        System.out.println(ArrayQModule.dequeue());
        System.out.println(ArrayQModule.size());

        System.out.println(ArrayQModule.isEmpty());
        ArrayQModule.clear();

        System.out.println(ArrayQModule.show());
    }
    public static void fill(int size){
        for(int i =0 ;i < size; i++){
            ArrayQModule.enqueue(i);
        }
    }
}
