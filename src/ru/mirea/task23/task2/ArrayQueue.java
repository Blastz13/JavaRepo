package ru.mirea.task23.task2;

public class ArrayQueue extends AbstractQ {
    private Object[] rrr;
    private int rs = 8;
    private int cs = 0;

    public ArrayQueue(){
        rrr = new Object[rs];
    }

    private void increaseRealSize(int newSize){
        if ( newSize < rrr.length) return;
        rs = newSize;
        Object[] tmp = new Object[rs];
        System.arraycopy(rrr, 0, tmp, 0, rrr.length);
        rrr = tmp;
    }
    protected void enquequeExecute(Object element){
        if (cs + 1 > rs * 0.75) increaseRealSize(rs *2);
        rrr[cs++] = element;
    }
    protected Object dequeueExecute(){
        Object[] tmp = new Object[rs];
        Object fel = rrr[0];
        System.arraycopy(rrr, 0, tmp, 0, cs--);
        rrr = tmp;
        return fel;
    }
    protected Object elementExecute(){
        return rrr[0];
    }
    protected String showExecute(){
        String tmp = "Array  Queue: ";
        for(Object element : rrr){
            tmp += element.toString() + " ";
        }
        return tmp;
    }
}
