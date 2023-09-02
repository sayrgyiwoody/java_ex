package chapter_14;

import javax.swing.*;

public class JFrameSubClass extends JFrame {

    public JFrameSubClass() {
        setTitle("First GUI Program");
        setSize(300, 200);
        setLocation(150,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameSubClass jf = new JFrameSubClass();
        jf.setVisible(true);
    }
}
