
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.Random;


class MyPanel extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel label1 = new JLabel("Label1 ");
        JLabel label2 = new JLabel("Label2 ");
        JTextField tf = new JTextField("TextField1");
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        // p.setLayout(new FlowLayout());
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {

            int count = 0;

            public void actionPerformed(ActionEvent e) {
                count++;
                label2.setText(Integer.toString(count));
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(tf.getText());
            }
        });

        b3.addActionListener(new ActionListener() {

            Random rand = new Random();

            @Override
            public void actionPerformed(ActionEvent e) {
                int r = rand.nextInt(255);
                int g = rand.nextInt(255);
                int b = rand.nextInt(255);
                panel1.setBackground(new Color(r, g, b));
                panel2.setBackground(new Color(r, b, g));
            }
        });
    }
}
