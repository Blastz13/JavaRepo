package ru.mirea.task3.Task3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Pages: "
                            + book.getPages() + " publish year: " + book.getPublishYear());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input title, author, publish year, count pages: ");
        book.setAuthor(scanner.next());
        book.setPages(scanner.nextInt());
        book.setTitle(scanner.next());
        book.setPublishYear(scanner.nextInt());

        System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Pages: "
                + book.getPages() + " publish year: " + book.getPublishYear());
    }
}