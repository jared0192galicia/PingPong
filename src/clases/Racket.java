package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Racket {
	private int x;
	private int y;
	
	static final int WIDTH = 10;
	private final int HEIGTH = 40;
	
	public Racket (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Rectangle2D getRacket () {
		return new Rectangle2D.Double(x, y, WIDTH, HEIGTH);
	}

	public void moveRackedR1 (Rectangle limits) {
		if ((Controls.w) && (y > limits.getMinY())) {
			y--;
		}
		if ((Controls.s) && (y < limits.getMaxY())) {
			y++;
		}
	}
	public void moveRackedR2 (Rectangle limits) {
		if ((Controls.up) && (y > limits.getMinY())) {
			y--;
		}
		if ((Controls.down) && (y < limits.getMaxY())) {
			y++;
		}
	}
}
