package ru.mirea.task11.var2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class App extends JFrame {
    JLabel[] labels = new JLabel[5];

    App() {
        super("App");
        setLayout(new BorderLayout());
        setSize(300, 300);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        labels[0] = new JLabel(" EAST    ");
        add(labels[0], BorderLayout.EAST);
        labels[1] = new JLabel("    WEST ");
        add(labels[1], BorderLayout.WEST);
        labels[2] = new JLabel("                                     NORTH");
        add(labels[2], BorderLayout.NORTH);
        labels[3] = new JLabel("                                     SOUTH");
        add(labels[3], BorderLayout.SOUTH);
        labels[4] = new JLabel("                      CENTER");
        add(labels[4], BorderLayout.CENTER);

        labels[0].addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null, "EAST", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labels[1].addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null, "WEST", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labels[2].addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null, "NORTH", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labels[3].addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null, "SOUTH", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labels[4].addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null, "CENTER", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        setVisible(true);
    }

    public static void main(String[] args) { App app = new App(); }
}