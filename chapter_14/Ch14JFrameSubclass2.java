package chapter_14;

import javax.swing.*;
import java.awt.*;

public class Ch14JFrameSubclass2 extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;


    public Ch14JFrameSubclass2() {

        //set the frame default properties        
        setTitle("Blue Background JFrame Subclass");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        changeBgColor();
    }

    private void changeBgColor() {
        Container contentPane =getContentPane();
        contentPane.setBackground(Color.BLUE);
    }

    public static void main (String [] args) {
        Ch14JFrameSubclass2 frame = new Ch14JFrameSubclass2();
        frame.setVisible(true);
    }
}
