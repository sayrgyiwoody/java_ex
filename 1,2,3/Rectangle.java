package java_1;
import javax.swing.*;
import java.awt.*;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame win;
		Container contentPane;
		Graphics g;
		
		win = new JFrame("Rectangles");
		win.setSize(300,200);
		win.setLocation(100,100);
		win.setVisible(true);
		
		contentPane = win.getContentPane();
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		g = contentPane.getGraphics();
		g.setColor(Color.BLUE);
		g.drawRect(50,50,100,30);
		
		g.setColor(Color.RED);
		g.fillRect(175, 50, 100, 30);
	}

}
