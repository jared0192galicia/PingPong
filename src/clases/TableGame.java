package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class TableGame extends JPanel {
	
	Ball ball = new Ball(0, 0);
	
	Racket r1 = new Racket(10, 200);
	Racket r2 = new Racket((794 - 10 - Racket.WIDTH), 200);
	
	public TableGame () {
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		draw(g2);
		update();
	}

	public void draw (Graphics2D g) {
		// Draw ball with method getBall
		g.fill(ball.getBall());
		g.fill(r1.getRacket());
		g.fill(r2.getRacket());
	}

	// Update the value for each iteration before the use method repaint
	public void update () {
		ball.moveBall(getBounds());
		r1.moveRackedR1(getBounds());
		r2.moveRackedR2(getBounds());
	}
	
	public void iterateGame() {
		while (true) {
			try {
				repaint();
				Thread.sleep(6);
			} catch (Exception e) {
				System.err.println("Error in method iterateGame");
			}
		}
	}
}














