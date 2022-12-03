package ru.mirea.task22.task2;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Пустая строка");
    }
}
