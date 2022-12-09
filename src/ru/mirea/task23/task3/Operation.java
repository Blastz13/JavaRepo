package ru.mirea.task23.task3;

public abstract class Operation implements TrippleExpression {

    private TrippleExpression el;
    private TrippleExpression er;

    public Operation(TrippleExpression el, TrippleExpression er){
        this.el = el;
        this.er = er;
    }

    public abstract int evaluate(int left, int right);
    public int evaluate(int x, int y, int z) {

        return evaluate(el.evaluate(x,y,z), er.evaluate(x,y,z));
    }

}
