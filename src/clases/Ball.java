package clases;

import java.awt.geom.Rectangle2D;

public class Ball {

	// Properties the ball
	private final int WIDTH = 15;
	private final int HEIGTH = 15;
	private int x;
	private int y;
	
	public Ball (int x, int y) {
		this.x	 = x;
		this.y = y;
	}
	
	public Rectangle2D getBall () {
		return new Rectangle2D.Double(x, y, WIDTH, HEIGTH);
	}
}
