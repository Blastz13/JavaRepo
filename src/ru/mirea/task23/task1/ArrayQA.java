package ru.mirea.task23.task1;

public class ArrayQA {
    private int curs = 0;
    private int rs = 8;
    private Object ar[];

    public ArrayQA(){
        ar = new Object[rs];
        curs = 0;
    }

    private static void increaseRealSize(ArrayQA current, int newSize){

        if ( newSize < current.ar.length) return;
        current.rs = newSize;
        Object[] tmp = new Object[current.rs];
        System.arraycopy(current.ar, 0, tmp, 0, current.curs);
        current.ar = tmp;
    }
    public static void enqueue(ArrayQA current, Object newElement){
        if ( newElement == null) return;

        if (current.ar.length + 1 >= current.rs *0.75) increaseRealSize(current,current.rs *2);
        current.ar[current.curs++] = newElement;
    }
    public static Object element(ArrayQA current){
        if(isEmpty(current)) return null;
        return current.ar[0];
    }

    public static Object dequeue(ArrayQA current){
        if (isEmpty(current)) return null;
        Object[] tm = new Object[current.rs];
        Object fel = current.ar[0];

        System.arraycopy(current.ar, 0, tm, 0, current.curs--);
        current.ar = tm;
        return fel;
    }
    public static int size(ArrayQA current){
        return current.curs;
    }
    public static boolean isEmpty(ArrayQA current){
        return (current.curs == 0);
    }
    public static void clear(ArrayQA current){
        current.curs = 0;
        current.rs = 8;
        current.ar = new Object[current.rs];
    }
    public static String show(ArrayQA current){
        String res = "Очередь: ";
        for (int i = 0; i < current.curs; i++) res += current.ar[i] + " ";
        return res;
    }
}

