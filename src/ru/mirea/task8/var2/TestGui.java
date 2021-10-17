package ru.mirea.task8.var2;

import javax.swing.*;
import java.awt.*;

public class TestGui extends JPanel {
    static Image img = new ImageIcon("./src/ru/mirea/task8/var2/pic.jpg").getImage();

    public void paintComponent (Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public static void main(String [] args) {
        JFrame F = new JFrame();
        F.setSize(640, 380);
        F.add(new TestGui());
        F.setVisible(true);
    }
}