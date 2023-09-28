package java_1;
import java.awt.*;

public class GraphicLotteryCard {
	public static final int WIDTH = 30;
	public static final int HEIGHT = 40;
	
	public void draw (Graphics g, int xOrigin, int yOrigin) {
		switch(color){
		case 1:
		g.setColor(Color.RED);
		break;
		
		case 2:
		g.setColor(Color.BLUE);
		break;
		}
		
		g.fillRect(xOrigin, yOrigin, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.drawString("" + number, xOrigin + WIDTH/4, yOrigin + HEIGHT/2 );
	}
}
