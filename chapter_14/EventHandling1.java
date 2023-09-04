package chapter_14;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class EventHandling1 extends JFrame implements ActionListener {
    JButton ok;
    JButton cancel;
    Container contentPane;

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e1){ //java.awt.event. need!
        if(e1.getSource().equals(ok)){
        JOptionPane.showMessageDialog(null,"Ok button is clicked");
        }
        if(e1.getSource().equals(cancel)) {
        JOptionPane.showMessageDialog(null,"Cancel button is clicked");
        }
    }  

    
    public EventHandling1() {
        setTitle("GUI Program");
        setSize(500,300);
        setLocation(150,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        ok = new JButton("OK");
        cancel = new JButton("CANCEL");

        ok.addActionListener(this);
        cancel.addActionListener(this);

        contentPane.add(ok);
        contentPane.add(cancel);
    }

    public static void main(String[] args) {
        EventHandling1 ev = new EventHandling1();
        ev.setVisible(true);
    }
}
