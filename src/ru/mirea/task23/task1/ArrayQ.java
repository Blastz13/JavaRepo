package ru.mirea.task23.task1;

public class ArrayQ {
    private int cusize = 0;
    private int rsize = 8;
    private Object ar[];

    public ArrayQ() {
        ar = new Object[rsize];
        cusize = 0;
    }

    private void increaseRealSize(int newSize) {

        if (newSize < ar.length) return;
        rsize = newSize;
        Object[] tmp = new Object[rsize];
        System.arraycopy(ar, 0, tmp, 0, cusize);
        ar = tmp;
    }

    public void enqueue(Object newElement) {

        if (newElement == null) return;
        if (ar.length + 1 >= rsize * 0.75) increaseRealSize(rsize * 2);
        ar[cusize++] = newElement;
    }

    public Object element() {
        if (isEmpty()) return null;
        return ar[0];
    }

    public Object dequeue() {

        if (isEmpty()) return null;
        Object[] tm = new Object[rsize];
        Object firstElement = ar[0];
        System.arraycopy(ar, 0, tm, 0, cusize);
        cusize--;
        ar = tm;
        return firstElement;
    }
    public int size() {
        return cusize;
    }
    public boolean isEmpty() {
        return (cusize == 0);
    }
    public void clear() {
        cusize = 0;
        rsize = 8;
        ar = new Object[rsize];
    }
    public String show() {
        String res = "Очередь: ";
        for (int i = 0; i < cusize; i++) res += ar[i] + " ";
        return res;
    }
}
