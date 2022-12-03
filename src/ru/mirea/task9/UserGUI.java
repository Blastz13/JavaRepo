package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class UserGUI extends JFrame {
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonMadrid = new JButton("Real Madrid");
    JButton buttonFinish = new JButton("Finish");

    private int score_milan = 0, score_madrid = 0;

    JLabel result = new JLabel("Result: " + score_milan + " X " + score_madrid);
    JLabel lastScore = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");


    public UserGUI() {
        super("Milan vs Madrid");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel gridButton = new JPanel(new GridLayout(1, 2, 5, 0));
        gridButton.add(buttonMilan);
        gridButton.add(buttonMadrid);

        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(gridButton);

        JPanel gridInfo = new JPanel(new GridLayout(3, 1, 5, 0));
        gridInfo.add(result);
        gridInfo.add(lastScore);
        gridInfo.add(winner);

        JPanel flowInfo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowInfo.add(gridInfo);

        Container container = getContentPane();
        container.add(flowButton, BorderLayout.SOUTH);
        container.add(flowInfo, BorderLayout.CENTER);
        container.add(buttonFinish, BorderLayout.NORTH);


        buttonMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                score_milan++;
                result.setText("Result: " + score_milan + " X " + score_madrid);
                lastScore.setText("Last Scorer: AC Milan");
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score_madrid++;
                result.setText("Result: " + score_milan + " X " + score_madrid);
                lastScore.setText("Last Scorer: Real Madrid");
            }
        });

        buttonFinish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowButton.setVisible(false);
                if (score_madrid > score_milan) {
                    winner.setText("Winner: Real Madrid");
                } else if (score_madrid == score_milan) {
                    winner.setText("Winner: DRAW");
                } else {
                    winner.setText("Winner: AC Milan");
                }
            }
        });

    }

    public static void main(String[] args) {
        new UserGUI().setVisible(true);
    }
}
