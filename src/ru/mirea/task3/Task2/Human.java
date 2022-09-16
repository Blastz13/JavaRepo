package ru.mirea.task3.Task2;

import ru.mirea.task3.Task2.Hand;
import ru.mirea.task3.Task2.Head;
import ru.mirea.task3.Task2.Leg;

import java.util.Scanner;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human() {
        head = new Head();
        leg = new Leg();
        hand = new Hand();
    }

    public Human(String haircolor, String haircut, String eyecolor, int fingers, int legsize) {
        head = new Head(haircolor, haircut, eyecolor);
        leg = new Leg(legsize);
        hand = new Hand(fingers);
    }

    public void waveHand() {
        hand.wave();
    }

    public void stompLeg() {
        leg.stomp();
    }

    public void getInfo() {
        leg.info();
        head.info();
        hand.info();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Human human = new Human();
        System.out.println("Default human:");
        human.getInfo();
        human.stompLeg();
        human.waveHand();
        String haircolor, haircut, eyecolor;
        int fingers, legsize;
        System.out.println("Enter hair color, hair style, eye color, shoe size, humber of fingers on 1 hand");
        haircolor = in.next();
        haircut = in.next();
        eyecolor = in.next();
        legsize = in.nextInt();
        fingers = in.nextInt();
        Human h = new Human(haircolor, haircut, eyecolor, fingers, legsize);
        h.getInfo();
    }

}