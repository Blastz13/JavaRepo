package ru.mirea.task23.task3;

public class Devide extends Operation{

    public Devide(TrippleExpression expLeft, TrippleExpression expRight){

        super(expLeft, expRight);
    }
    public int evaluate(int left, int right){

        return left / right;
    }
    public double evaluate(double left, double right){

        return left / right;
    }

}
