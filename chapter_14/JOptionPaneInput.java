package chapter_14;

import javax.swing.*;

public class JOptionPaneInput {

    public static void main(String args[]) {
        String inputStr = JOptionPane.showInputDialog(null, "What's your name?");
        JOptionPane.showMessageDialog(null,"Your name is " + inputStr);
    }

}
