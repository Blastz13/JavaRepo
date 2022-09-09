package ru.mirea.task2.Task3;

public class Book {
    String name, author;
    int countPage;

    public Book(String name, String author, int countPage) {
        this.name = name;
        this.author = author;
        this.countPage = countPage;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCountPage(int rate) {
        this.countPage = rate;
    }

    public String toString()
    {
        return "Book: " + getName() + " Author: " + getAuthor() + ", Count Page: " + getCountPage();
    }
}
