package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class TableGame extends JPanel {
	Ball ball = new Ball(0, 0);
	public TableGame () {
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		draw(g2);
	}

	public void draw (Graphics2D g) {
		// Draw ball with method getBall
		g.fill(ball.getBall());
	}

	public void update () {
		
	}
}
