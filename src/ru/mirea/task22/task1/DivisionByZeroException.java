package ru.mirea.task22.task1;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException(){
        super("Деление на ноль!");
    }
}
