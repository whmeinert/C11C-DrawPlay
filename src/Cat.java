import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/3 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/3;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/4;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// ear will be about 1/5 from top of head and 1/5 from left
	private static final int EAR_Y = HEAD_DIMENSION/3+10;
	private static final int EAR_X = HEAD_DIMENSION/2 + 5;
	private static final int EAR_SEPARATION = HEAD_DIMENSION/3 * 2;
	// ear will be two times the size of mouth and height and width will be switched
	private static final int EAR_HEIGHT = MOUTH_WIDTH*2;
	private static final int EAR_WIDTH = MOUTH_HEIGHT*7/3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		// Draw the ears
		g2.setColor(Color.black);
		int x = EAR_X;
		int y = EAR_Y;
		g2.fillOval(x, y, EAR_WIDTH , EAR_HEIGHT);
		x += EAR_SEPARATION;
		g2.fillOval(x, y, EAR_WIDTH , EAR_HEIGHT);
		// Draw the head
		g2.setColor(Color.black);
		x=catX;
		y=catY;
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		
		g2.setColor(Color.black);
		// Meow text appears below cat head, +20 places below 
		// so it doesn't overlap the drawing and +35 places over
		// so it is under the middle of the cat
		g2.drawString("Meow", catX + 35, catY + HEAD_DIMENSION + 20);	
	}
}
