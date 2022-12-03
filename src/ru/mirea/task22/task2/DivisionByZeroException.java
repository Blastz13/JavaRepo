package ru.mirea.task22.task2;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException() {
        super("Деление на ноль");
    }
}
