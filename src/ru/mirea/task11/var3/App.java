package ru.mirea.task11.var3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame {
    JTextArea textArea = new JTextArea();
    JMenuBar jMenuBar = new JMenuBar();
    JMenu color, font;
    JMenuItem blue,yellow,red,bold,normal,italic;

    public App() {
        setSize(500,300);
        setLocationRelativeTo(null);
        setJMenuBar(jMenuBar);
        color = new JMenu("Color");
        font = new JMenu("Font");
        blue = color.add("blue");
        yellow = color.add("yellow");
        red = color.add("red");
        bold = font.add("bold");
        normal = font.add("normal");
        italic = font.add("italic");
        jMenuBar.add(color);
        jMenuBar.add(font);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        textArea.setPreferredSize(new Dimension(300,70));
        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.YELLOW);
            }
        });

        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        bold.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SERIF,Font.BOLD,12));
            }
        });

        normal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SERIF,Font.PLAIN,12));
            }
        });

        italic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SERIF,Font.ITALIC,12));
            }
        });
        add(textArea);
    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}