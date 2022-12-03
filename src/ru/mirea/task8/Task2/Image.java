package ru.mirea.task8.Task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends JFrame {
    public Image(String href) throws IOException {
        super("Image");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(href));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }

    public static void main(String[] args) throws IOException {
        new Image("src/ru/mirea/task8/Task2/img.jpeg").setVisible(true);
    }
}
