package ru.mirea.task8.var1;
import javax.swing.*;
import java.awt.*;

public class TestGui extends JFrame {
    JPanel jp;

    public TestGui() {
        super("Окно с фигурами");
        super.setSize(1280, 720);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp = new GPanel();
        super.add(jp);
        //super.add(new JLabel(new ImageIcon("D:/image.png")));
    }

    public static void main(String[] args) {
        TestGui g1 = new TestGui();
        g1.setVisible(true);
    }

    class GPanel extends JPanel {
        public GPanel() {
            super.setPreferredSize(new Dimension(1280, 720));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //rectangle originated at 10,10 and end at 240,240
            //g.drawRect(10, 10, 240, 240);

            //filled Rectangle with rounded corners.
            g.fillRoundRect(50, 50, 100, 100, 80, 80);
            g.drawOval(20, 20, 200, 50);
            g.fillRoundRect(200, 200, 100, 100, 100, 100);
            g.drawRect(50, 350, 70, 70);
            g.setColor(Color.cyan);
            g.drawRect(100, 600, 70, 70);
            g.drawArc(1000, 500, 52, 53, 300, 500);
            g.fillRect(800, 100, 26, 26);
            g.setColor(Color.magenta);
            g.fillRoundRect(300, 380, 80, 50, 20, 70);
            g.draw3DRect(556, 565, 587, 55, true);



            //g.drawImage(img, 552, 380, null);


        }
    }
}