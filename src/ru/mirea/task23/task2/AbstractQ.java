package ru.mirea.task23.task2;

public abstract class AbstractQ implements Queue {
    private int size = 0;
    protected abstract void enquequeExecute(Object element);
    protected abstract Object elementExecute();
    protected abstract Object dequeueExecute();
    protected abstract String showExecute();


    @Override
    public void enqueue(Object element) {
        if (element == null) return;
        size++;
        enquequeExecute(element);
    }

    @Override
    public Object element() {

        return (size == 0) ? null : elementExecute();
    }

    @Override
    public Object dequeue() {
        return (size-- == 0) ? null : dequeueExecute();
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {

        return (size == 0);
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    @Override
    public String show() {

        return showExecute();
    }
}
