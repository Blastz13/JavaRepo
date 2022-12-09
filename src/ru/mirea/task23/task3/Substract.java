package ru.mirea.task23.task3;

public class Substract extends Operation{

    public Substract(TrippleExpression expLeft, TrippleExpression expRight){
        super(expLeft, expRight);
    }

    public int evaluate(int left, int right){
        return left - right;
    }

    public double evaluate(double left, double right){
        return left - right;
    }
}
