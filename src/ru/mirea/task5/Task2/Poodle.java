package ru.mirea.task5.Task2;

public class Poodle extends Dog {
    public Poodle(String name, int age){
        super(name,age);
    }
    @Override
    public String toString() {
        return "Poodle name is "+ getName() +", he is "+ getAge() +" years";
    }
}
