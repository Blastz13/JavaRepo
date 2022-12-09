package ru.mirea.task23.task1;

public class testQ {
    public static void main(String[] args) {
        ArrayQ queue = new ArrayQ();
        fill(queue, 12);
        System.out.println(queue.show());

        System.out.println(queue.element());
        System.out.println(queue.dequeue());

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println(queue.show());
    }

    public static void fill(ArrayQ queue, int size) {
        for (int i = 0; i < size; i++) queue.enqueue(i);
    }
}
