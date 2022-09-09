package ru.mirea.task3.Task3;

public class Book {
    private String title, author;
    private int publishYear, pages;

    public Book() {
        title = "Default Title Book";
        author="No Name";
        publishYear=0;
        pages=0;
    }

    public Book(String title, String author, int publishYear, int pages)
    {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}