package ru.mirea.task9;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Label;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    public static void main(String[] args) {
        new Form();
    }

    JButton buttonMadrid, buttonMilan;
    JLabel labelResult, labelScorer;
    Label labelWinner;
    byte countMadrid = 0, countMilan = 0;

    public void setIncrement(String FBCommand) {
        switch (FBCommand) {
            case "Real Madrid":
                countMadrid++;
                break;
            case "AC Milan":
                countMilan++;
                break;
        }
        labelResult.setText("Result: " + countMilan + " x " + countMadrid);
        labelScorer.setText("Last Scorer: " + FBCommand);
        labelWinner.setText("Winner: "
                + (countMadrid > countMilan ? "Real Madrid" : countMadrid == countMilan ? "DRAW" : "AC Milan"));
    }

    void initialize() {
        setSize(360, 240);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buttonMadrid = new JButton();
        buttonMadrid.setBounds(224, 8, 112, 24);
        buttonMadrid.setText("Real Madrid");
        buttonMadrid.addActionListener(new EventHandler());

        buttonMilan = new JButton();
        buttonMilan.setBounds(8, 8, 112, 24);
        buttonMilan.setText("AC Milan");
        buttonMilan.addActionListener(new EventHandler());

        labelResult = new JLabel();
        labelResult.setHorizontalAlignment(SwingConstants.CENTER);
        labelResult.setBounds(0, 48, getWidth(), 16);

        labelScorer = new JLabel();
        labelScorer.setHorizontalAlignment(SwingConstants.CENTER);
        labelScorer.setBounds(0, 72, getWidth(), 16);

        labelWinner = new Label();
        labelWinner.setAlignment(Label.CENTER);
        labelWinner.setBounds(0, 96, getWidth(), 16);

        add(buttonMadrid);
        add(buttonMilan);
        add(labelResult);
        add(labelScorer);
        add(labelWinner);
    }

    public Form() {
        initialize();
        setIncrement("N/A");
        setVisible(true);
    }

    class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setIncrement(((JButton) e.getSource()).getText());
        }
    }
}
