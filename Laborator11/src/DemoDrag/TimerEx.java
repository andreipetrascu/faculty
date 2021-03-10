package DemoDrag;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class TimerEx extends JPanel implements ActionListener {
    JLabel l;
    Timer t;
    int x = 10;
    int y = 200;

    TimerEx() {
        ImageIcon img = new ImageIcon("1.png");
        l = new JLabel(img);
        l.setLocation(x, y);
        this.add(l);
        setBackground(Color.lightGray);
        t = new Timer(300, this);
        t.start();
    }

    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        x = r.nextInt(500);
        y = r.nextInt(500);
        x += 40;
        if (x > 800) x = 10;
        l.setLocation(x, y);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Timer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        TimerEx pane = new TimerEx();
        frame.setContentPane(pane);
        frame.setVisible(true);
    }
}