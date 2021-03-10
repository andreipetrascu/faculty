package CurrencyConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ConvView extends JFrame {

    private String money[] = {"RON", "EUR", "USD"};
    private JComboBox firstBox = new JComboBox(money);
    private JComboBox secondBox = new JComboBox(money);
    private JButton convBtn = new JButton("Convert");
    private JLabel label1 = new JLabel("Input");
    private JLabel label2 = new JLabel("Output");
    private JLabel label3 = new JLabel(" (select) = (select)");

    private JTextField inputTf = new JTextField(15);
    private JTextField outputTf = new JTextField(15);

    public ConvView(ConvModel model) {

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        // p4.setBackground(Color.getHSBColor(34, 67, 200));

        outputTf.setEditable(false);
        p1.setLayout(new GridLayout(3, 1));
        p3.setLayout(new GridLayout(3, 1));
        p2.setLayout(new GridLayout(2, 1));
        p4.setLayout(new FlowLayout());

        p1.add(inputTf);
        p1.add(label1);
        p1.add(firstBox);

        p2.add(convBtn);
        p2.add(label3);

        p3.add(outputTf);
        p3.add(label2);
        p3.add(secondBox);

        p4.add(p1);
        p4.add(p2);
        p4.add(p3);

        this.setContentPane(p4);
        this.pack();
        this.setVisible(true);
        this.setSize(700, 300);
        this.setTitle("Currency Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addConvertListener(ActionListener a) {
        convBtn.addActionListener(a);
    }

    public void setConvertedValue(String total) {
        outputTf.setText(total);
    }

    public String getAmount() {
        return inputTf.getText();
    }

    public String getFirstCurrency() {
        return firstBox.getSelectedItem().toString();
    }

    public String getSecondCurrency() {
        return secondBox.getSelectedItem().toString();
    }

    public void setLabel3(String msg) {
        label3.setText(msg);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }


}
