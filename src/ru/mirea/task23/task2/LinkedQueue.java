package ru.mirea.task23.task2;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQ {
    private LinkedList<Object> queue;

    public LinkedQueue() {
        queue = new LinkedList<>();
    }
    protected void enquequeExecute(Object element) {
        queue.add(element);
    }
    protected Object elementExecute() {
        return queue.getFirst();

    }

    protected Object dequeueExecute() {
        return queue.removeFirst();

    }

    protected String showExecute() {
        String tmp = "Linked  Queue: ";
        for (Object element : queue) {
            tmp += element.toString() + " ";
        }
        return tmp;
    }


}
