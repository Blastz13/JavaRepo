package ru.mirea.task22.task2;

public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("Стек пустой!");
    }
}
