package chapter_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonHandler extends JFrame implements  ActionListener {
    public ButtonHandler() {
       
    } 

    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();

        frame.setTitle("You clicked " + buttonText);
    }
}
