package ru.mirea.task22.task1;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("Стек пуст!");
    }
}
