package ru.mirea.task2.Task4;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Кличка: " + getName() + ", возраст: " + getAge() + ", В переводе на человеческий: " + getHumanAge();
    }
}
