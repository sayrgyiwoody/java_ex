package chapter_14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class testInput extends JFrame implements ActionListener {

    Container contentPane ;
    JButton enter;
    JTextField input;

    @Override 
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource().equals(enter)){

            String name = input.getText();
            JOptionPane.showMessageDialog(null,"Your name is " + name);
        }
    }


    public testInput() {
        contentPane = getContentPane();
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());


        input = new JTextField(20); //set the width of the text input field
        input.addActionListener(this);
        contentPane.add(input);

        JLabel textLabel = new JLabel("Please enter your name");
        contentPane.add(textLabel);

        // JLabel imgLabel = new JLabel(new ImageIcon ("cat.gif"));
        // contentPane.add(imgLabel);

        //for enter button 
        enter = new JButton("enter");
        enter.addActionListener(this);
        contentPane.add(enter);

        //set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // testInput ti = new testInput();
        // ti.setVisible(true);

        SwingUtilities.invokeLater(() -> new testInput());
    }

}
