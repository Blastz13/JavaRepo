package ru.mirea.task22.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    private JPanel panelMainFrame;

    private JButton btn0, btn1, btn2, btn3,
            btn4,
            btn5,
            btn6,
            btn7,
            btn8,
            btn9, btnp,
            btnm, btnd, btnMultiply, btnDot, btnClear,
            btnres;

    private JTextField textInField;

    public CalculatorView(JPanel panelMainFrame) {
        this.panelMainFrame = panelMainFrame;
        panelMainFrame.setSize(200, 300);
        panelMainFrame.setMaximumSize(new Dimension(200, 300));
        btn0 = new JButton("0");
        btn0.setBackground(Color.WHITE);
        btn1 = new JButton("1");
        btn1.setBackground(Color.WHITE);
        btn2 = new JButton("2");
        btn2.setBackground(Color.WHITE);
        btn3 = new JButton("3");
        btn3.setBackground(Color.WHITE);
        btn4 = new JButton("4");
        btn4.setBackground(Color.WHITE);
        btn5 = new JButton("5");
        btn5.setBackground(Color.WHITE);
        btn6 = new JButton("6");
        btn6.setBackground(Color.WHITE);
        btn7 = new JButton("7");
        btn7.setBackground(Color.WHITE);
        btn8 = new JButton("8");
        btn8.setBackground(Color.WHITE);
        btn9 = new JButton("9");
        btn9.setBackground(Color.WHITE);
        btnres = new JButton("=");
        btnres.setBackground(Color.WHITE);
        btnp = new JButton("+");
        btnp.setBackground(Color.WHITE);btnm = new JButton("-");
        btnm.setBackground(Color.WHITE);btnd = new JButton("/");
        btnd.setBackground(Color.WHITE);btnMultiply = new JButton("*");
        btnMultiply.setBackground(Color.WHITE);btnClear = new JButton("C");
        btnClear.setBackground(Color.WHITE);
        btnDot = new JButton(".");
        btnDot.setBackground(Color.WHITE);
        textInField = new JTextField(16);
        textInField.setEditable(false);
        textInField.setBackground(Color.white);
        JPanel panel = new JPanel();
        panel.add(textInField);
        panel.add(btnp);
        panel.add(btn1);
        panel.add(btn2); panel.add(btn3); panel.add(btnm); panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnMultiply);
        panel.add(btn7); panel.add(btn8);
        panel.add(btn9); panel.add(btnd);
        panel.add(btnDot); panel.add(btn0);
        panel.add(btnClear); panel.add(btnres);
        panel.setBackground(Color.MAGENTA);
        panelMainFrame.add(panel);
    }

    public void setActionListener(ActionListener actionListener) {
        btnMultiply.addActionListener(actionListener);
        btnd.addActionListener(actionListener);
        btnm.addActionListener(actionListener);
        btnp.addActionListener(actionListener); btn9.addActionListener(actionListener); btn8.addActionListener(actionListener);
        btn7.addActionListener(actionListener); btnDot.addActionListener(actionListener); btnClear.addActionListener(actionListener);
        btn6.addActionListener(actionListener); btn4.addActionListener(actionListener); btn3.addActionListener(actionListener);
        btn5.addActionListener(actionListener);  btn2.addActionListener(actionListener); btn1.addActionListener(actionListener); btn0.addActionListener(actionListener); btnres.addActionListener(actionListener);
    }

    public String getUserInput() {
        return textInField.getText();
    }

    public void setTextInField(String text) {
        textInField.setText(text);
    }

    public void showAlertDialog(String message) {
        JOptionPane.showMessageDialog(panelMainFrame, message);
    }
}
