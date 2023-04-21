/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10oop;

/**
 *
 * @author LAB203_56
 */
import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p, a;
    private JButton btn1, btn2, btn3;
    private JLabel lb1, lb2;
    private JTextField tf, tf1;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        p = new JPanel();
        a = new JPanel();
        tf = new JTextField("6000");
        tf1 = new JTextField();
        tf.setEditable(false);
        a.setLayout(new GridLayout(2,2));
        a.add(lb1); a.add(tf);
        a.add(lb2); a.add(tf1);
        fr.setLayout(new BorderLayout());
        fr.add(a, BorderLayout.NORTH);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        fr.add(p, BorderLayout.SOUTH);
        fr.setLayout(new GridLayout(3, 1));
        fr.pack();
        fr.setResizable(false);
        fr.setVisible(true);
    }
}
