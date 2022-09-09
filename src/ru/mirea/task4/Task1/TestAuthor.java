package ru.mirea.task4.Task1;

public class TestAuthor {
    public static void main(String [] args) {
        Author author=new Author("Vasya","oleg@mail.ru",'М');
        System.out.println(author);
        author.setEmail("vika@mail.ru");
        System.out.println(author);
    }
}