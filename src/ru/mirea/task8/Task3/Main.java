package ru.mirea.task8.Task3;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {

        framlist.add(new ImageIcon("src/ru/mirea/task8/Task3/folder/1.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Task3/folder/2.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Task3/folder/3.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Task3/folder/4.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Task3/folder/5.png").getImage());


        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < framlist.size(); i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
