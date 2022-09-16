package ru.mirea.task2.Task3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Капитанская дочка", "А.C. Пушкин", 128);
        System.out.println(book);
        book.setAuthor("Undefined Name");
        book.setName("No Name");
        System.out.println(book);
    }
}
