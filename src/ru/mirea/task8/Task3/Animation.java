package ru.mirea.task8.Task3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Animation extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Animation(){
        super("Task 7_3");
        setLayout(new FlowLayout());
        setSize(466,466);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 466, 466, null);
    }

}
