package ru.mirea.task8.Task1;

import javax.swing.*;
import java.awt.*;

public class Twenty extends JFrame {
    private static final int WIDTH = 1400;
    private static final int HEIGHT = 800;

    public Twenty() {
        super("Задание");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    public static Shape getRandomShape() {
        int rand = (int) (Math.random() * 3);
        if (rand == 0)
            return new Rectangle();
        else if (rand == 1)
            return new Circle();
        else
            return new Square();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0, x = 15; i < 5; ++i, x += 280)
            for (int j = 0, y = 35; j < 4; ++j, y += 175) {

                Shape shape = getRandomShape();
                shape.setXY(x, y);
                shape.setColor(new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));

                g.setColor(shape.getColor());
                if (shape.getClass().getSimpleName().equals("Square"))
                    g.fillRect(shape.getX(), shape.getY(), 150, 150);
                else if (shape.getClass().getSimpleName().equals("Rectangle"))
                    g.fillRect(shape.getX(), shape.getY(), 200, 150);
                else if (shape.getClass().getSimpleName().equals("Circle"))
                    g.fillOval(shape.getX(), shape.getY(), 150, 150);
            }
    }

    private static void createAndShowGUI() {
        Twenty tw = new Twenty();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
