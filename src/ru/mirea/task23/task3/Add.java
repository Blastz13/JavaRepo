package ru.mirea.task23.task3;

import ru.mirea.task23.task3.TrippleExpression;

public class Add extends Operation{
    public Add(TrippleExpression expLeft, TrippleExpression expRight){

        super(expLeft, expRight);
    }
    public int evaluate(int left, int right){

        return left + right;
    }
    public double evaluate(double left, double right){

        return left + right;
    }

}
