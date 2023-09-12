package chapter_14;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex_11 extends JFrame implements ActionListener {
    private JTextField inputNum;
    private JButton btn;
    private JTextArea primeNumberArea;
    Container contentPane;

    public ex_11 () {
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        inputNum = new JTextField(10);
        inputNum.addActionListener(this);
        contentPane.add(inputNum);

        btn = new JButton("Generate");
        btn.addActionListener(this);
        contentPane.add(btn);

        primeNumberArea = new JTextArea(5,20);
        primeNumberArea.setEditable(false);
        JScrollPane scrollText = new JScrollPane(primeNumberArea);
        scrollText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        contentPane.add(scrollText);


        setSize(300, 400);
        setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private ArrayList<Integer> getPrimeNumbers(int N) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        
        for(int num = 2 ; num <= N ; num++) {
            if(this.isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        return primeNumbers;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;

        if(num % 2 == 0) return false;

        for(int i = 3; i <= Math.sqrt(num) ; i+= 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ex_11 frame = new ex_11();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btn) || e.getSource().equals(inputNum)){

            try {
                int N = Integer.parseInt(inputNum.getText());

            ArrayList<Integer> primeNumbers =  this.getPrimeNumbers(N);

            // Convert ArrayList data to a string
            StringBuilder sb = new StringBuilder();
            for (int p : primeNumbers) {
                sb.append(p).append("\n");
            }
            String text = sb.toString();

            primeNumberArea.setText(text);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.");
        }

        }
    }

}
