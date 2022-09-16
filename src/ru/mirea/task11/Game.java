package ru.mirea.task11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;


class Game extends JFrame {
    JButton tryButton = new JButton("Try");
    JTextField numberField = new JTextField(2);
    JLabel stateText = new JLabel("Try guess number");
    int guessNumber = (int) (Math.random()*20);
    int cnt =0;

    public Game(){
        super("Java11");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel grid = new JPanel(new GridLayout(3,1,5,0));
        grid.add(stateText);
        grid.add(numberField);
        grid.add(tryButton);

        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(grid);

        Container window = getContentPane();
        window.add(flowButton);

        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNumber = Integer.parseInt(numberField.getText());
                if (userNumber==guessNumber){
                    stateText.setText("You won");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
                else if (userNumber!=guessNumber){
                    if (userNumber<guessNumber){
                        stateText.setText("The number is greater");
                    }
                    else {
                        stateText.setText("The number less");
                    }
                }
                cnt++;
                if (cnt==3 && userNumber!= guessNumber){
                    stateText.setText("Attemps expended");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}

