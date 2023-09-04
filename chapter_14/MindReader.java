package chapter_14;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import javafx.scene.layout.Border;

import java.awt.event.*;


public class MindReader extends JFrame implements ActionListener {

    Container contentPane ;
    JButton enter;
    JTextField input;

    @Override 
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource().equals(enter)){

            String number = input.getText();

            if(!number.isEmpty()){
                JOptionPane.showMessageDialog(null,"You're thinking " + number);
            }else {
                JOptionPane.showMessageDialog(null, "Please input something");
            }
        }
    }


    public MindReader() {
        contentPane = getContentPane();
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //img
        
        ImageIcon icon = new ImageIcon("design-thinking.png");
        contentPane.add(new JLabel(icon));


        input = new JTextField(20); 
        input.addActionListener(this);
        contentPane.add(input);


        JLabel titleLabel = new JLabel("Mind reader , this program can read your mind.");
        contentPane.add(titleLabel);

        JLabel textLabel = new JLabel("Think of a number");
        textLabel.setFont(new Font("Poppins", Font.BOLD,20));
        contentPane.add(textLabel);

        

        //for enter button 
        enter = new JButton("read mind");
        enter.addActionListener(this);
        
        contentPane.add(enter);

        //set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocation(500,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        // MindReader ti = new MindReader();
        // ti.setVisible(true);

        SwingUtilities.invokeLater(() -> new MindReader());
    }

}
