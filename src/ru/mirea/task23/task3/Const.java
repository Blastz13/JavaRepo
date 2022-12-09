package ru.mirea.task23.task3;

public class Const implements TrippleExpression {

    Integer iVal;
    Double dVal;
    public Const(Double dVal) {
        this.dVal = dVal;
        this.iVal = Integer.valueOf(dVal.toString());
    }
    public Const(Integer iVal) {
        this.dVal = iVal.doubleValue();
        this.iVal = iVal;
    }

    public int evaluate(int x){
        return iVal;
    }
    public double evaluate(double x){

        return dVal;
    }
    public int evaluate(int x, int y, int z) {

        return iVal;
    }
}
