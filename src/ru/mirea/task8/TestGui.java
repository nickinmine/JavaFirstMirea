package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;

public class TestGui extends JFrame {
    JPanel jp;

    public TestGui() {
        super("Simple Drawing");
        super.setSize(300, 300);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp = new GPanel();
        super.add(jp);
    }

    public static void main(String[] args) {
        TestGui g1 = new TestGui();
        g1.setVisible(true);
    }

    class GPanel extends JPanel {
        public GPanel() {
            super.setPreferredSize(new Dimension(300, 300));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //rectangle originated at 10,10 and end at 240,240
            g.drawRect(10, 10, 240, 240);

            //filled Rectangle with rounded corners.
            g.fillRoundRect(50, 50, 100, 100, 80, 80);
        }
    }
}