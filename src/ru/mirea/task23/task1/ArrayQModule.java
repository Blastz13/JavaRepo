package ru.mirea.task23.task1;

public class ArrayQModule {

    private static int curs = 0;
    private static int rs = 8;
    private static Object ar[];
    public ArrayQModule() {
        ar = new Object[rs];
        curs = 0;
    }
    private static void increaseRealSize(int ns) {

        if (ns < ar.length) return;
        rs = ns;
        Object[] tmp = new Object[rs];
        System.arraycopy(ar, 0, tmp, 0, curs);
        ar = tmp;
    }
    public static void enqueue(Object newel) {
        if (newel == null) return;
        if (ar.length + 1 >= rs * 0.75) increaseRealSize(rs * 2);
        ar[curs++] = newel;
    }

    public static Object element() {
        if (isEmpty()) return null;
        return ar[0];
    }

    public static Object dequeue() {
        if (isEmpty()) return null;
        Object[] tmp = new Object[rs];
        Object fel = ar[0];

        System.arraycopy(ar, 0, tmp, 0, curs--);
        ar = tmp;
        return fel;
    }

    public static int size() {
        return curs;
    }

    public static boolean isEmpty() {
        return (curs == 0);
    }

    public static void clear() {
        curs = 0;
        rs = 8;

        ar = new Object[rs];
    }

    public static String show() {
        String res = "Очередь: ";
        for (int i = 0; i < curs; i++) res += ar[i] + " ";
        return res;
    }

}
