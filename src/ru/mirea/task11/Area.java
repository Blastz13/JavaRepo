package ru.mirea.task11;

import javax.swing.*;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area extends JFrame {
    private JPanel mainPanel;
    private JRadioButton colour1;
    private JRadioButton colour2;
    private JRadioButton colour3;
    private JLabel textLabel;
    private JRadioButton font1;
    private JRadioButton font2;
    private JRadioButton font3;

    public Area() {

        //textLabel.setFont(new Font("Arial", Font.BOLD, 22));

        colour1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour2.setSelected(false);
                colour3.setSelected(false);
                textLabel.setForeground(Color.BLACK);
            }
        });
        colour2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour1.setSelected(false);
                colour3.setSelected(false);
                textLabel.setForeground(Color.PINK);
            }
        });
        colour3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour1.setSelected(false);
                colour2.setSelected(false);
                textLabel.setForeground(Color.BLUE);
            }
        });
        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setFont(new Font("Arial", Font.BOLD, 12));
                font2.setSelected(false);
                font3.setSelected(false);
            }
        });
        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                font1.setSelected(false);
                font3.setSelected(false);
            }
        });
        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setFont(new Font("Calibri", Font.BOLD, 30));
                font1.setSelected(false);
                font2.setSelected(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Area");
        frame.setContentPane(new Area().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
