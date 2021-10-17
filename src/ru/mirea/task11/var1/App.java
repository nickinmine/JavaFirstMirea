package ru.mirea.task11.var1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Game extends JFrame {
    JTextField textfield = new JTextField(2);
    Font font = new Font("Times new roman",Font.BOLD,20);
    JButton btnConfirm = new JButton("Поехали");
    int counts = 3;

    Game() {
        super("Игра");
        super.setSize(400, 200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textfield);
        textfield.setForeground(Color.PINK);
        textfield.setFont(font);
        add(btnConfirm);
        btnConfirm.setFont(font);
        int randN = (int) (Math.random() * 20);
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int N = Integer.parseInt(textfield.getText().trim());
                counts--;
                if (counts >= 0)
                    if (N != randN)
                        if (N > randN)
                            JOptionPane.showMessageDialog(null, "Вы ввели число " + N + ". Загаданное число меньше. " + "Осталось попыток: " + counts + ".", "Результат", JOptionPane.INFORMATION_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(null, "Вы ввели число " + N + ". Загаданное число больше. " + "Осталось попыток: " + counts + ".", "Результат", JOptionPane.INFORMATION_MESSAGE);
                    else {
                        JOptionPane.showMessageDialog(null, "Поздравляем! Вы угадали число!","Победа",JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new Game();
                    }
                else {
                    JOptionPane.showMessageDialog(null, "Вы не угадали число (загаданное число: " + randN + ")", "Игра окончена", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Game();
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[]args) {
        Game game = new Game();
    }
}