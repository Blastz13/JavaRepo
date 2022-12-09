package ru.mirea.task23.task1;

public class testA {
    public static void main(String[] args) {
        ArrayQA queue = new ArrayQA();
        fill(queue,12);
        System.out.println(ArrayQA.show(queue));

        System.out.println(ArrayQA.element(queue));

        System.out.println(ArrayQA.dequeue(queue));
        System.out.println(ArrayQA.size(queue));

        System.out.println(ArrayQA.isEmpty(queue));
        ArrayQA.clear(queue);

        System.out.println(ArrayQA.show(queue));
    }

    public static void fill(ArrayQA queueADT, int size){
        for (int i = 0; i < size; i++) ArrayQA.enqueue(queueADT, i);
    }
}
