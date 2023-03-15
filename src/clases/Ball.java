package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Ball {

	// Properties the ball
	private final int WIDTH = 15;
	private final int HEIGTH = 15;
	static int x;
	static int y;
	
	// Razon the moving
	private int dx = 1;
	private int dy = 1;
	
	public Ball (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Rectangle2D getBall () {
		return new Rectangle2D.Double(x, y, WIDTH, HEIGTH);
	}
	
	public void moveBall (Rectangle limits, boolean collisionR1, boolean collisionR2) {
		x += dx;
		y += dy;

		// Rebut at collision with racket
		if (collisionR1) {
			dx = -dx;
			x = 25;
		}
		if (collisionR2) {
			dx = -dx;
			x = 755;
		}

		
		// Limits the moving for Ball
		if (x > limits.getMaxX()) {
			dx = -dx;
			System.out.println("Punto mas izq");
			TableGame.pointL++;
		}
		if (y > limits.getMaxY()) {
			dy = -dy;
		}
		
		// Change direction in borders
		if (x < 0) {
			dx = -dx;
			System.out.println("Punto mas der");
			TableGame.pointR++;
		}
		if (y < 35) {
			dy = -dy;
		}
	}
}







