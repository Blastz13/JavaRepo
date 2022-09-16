package ru.mirea.task11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseControl extends JFrame {
    JLabel eastText = new JLabel("east");
    JLabel westText = new JLabel("west");
    JLabel northText = new JLabel("north");
    JLabel southText = new JLabel("south");
    JLabel centerText = new JLabel("  center");



    public MouseControl(){
        super("Java11");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);
        Container window = getContentPane();
        window.add(northText, BorderLayout.NORTH);
        window.add(southText, BorderLayout.SOUTH);
        window.add(westText, BorderLayout.WEST);
        window.add(eastText, BorderLayout.EAST);
        window.add(centerText, BorderLayout.CENTER);



        eastText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                eastText.setText("Welcome to east");
                JOptionPane.showMessageDialog(null,"Welcome to East");
            }
        });

        eastText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                eastText.setText("east");
            }
        });

        westText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                westText.setText("Welcome to west");
                JOptionPane.showMessageDialog(null,"Welcome to West");
            }
        });

        westText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                westText.setText("west");
            }
        });

        northText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                northText.setText("Welcome to north");
                JOptionPane.showMessageDialog(null,"Welcome to North");
            }
        });

        northText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                northText.setText("north");
            }
        });

        southText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                southText.setText("Welcome to south");
                JOptionPane.showMessageDialog(null,"Welcome to South");
            }
        });

        southText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                southText.setText("south");
            }
        });

        centerText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                centerText.setText("  Welcome to center");
                JOptionPane.showMessageDialog(null,"Welcome to Center");
            }
        });

        centerText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                centerText.setText("  center");
            }
        });

    }



    public static void main(String[] args) {
        new MouseControl().setVisible(true);
    }
}
