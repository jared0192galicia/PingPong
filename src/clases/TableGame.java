package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class TableGame extends JPanel {
	
	Ball ball = new Ball(0, 36);
	private JLabel label = new JLabel("Puntuación");
	private JLabel point1 = new JLabel("1");
	private JLabel point2 = new JLabel("2");
	protected static int pointR = 0;
	protected static int pointL = 0;
	// Create Rackets for the game
	Racket r1 = new Racket(10, 200);
	Racket r2 = new Racket((794 - 10 - Racket.WIDTH), 200);
	
	public TableGame () {
		setBackground(Color.BLACK);
		// Properties for labels
		label.setFont(new Font("Areal", ALLBITS, 18));
		label.setForeground(new Color(245, 245, 245));
		point2.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.BOLD, 22));
		point1.setForeground(new Color(200, 200, 200));
		point2.setForeground(new Color(200, 200, 200));
		point1.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.BOLD, 22));
		// Add labels for points
		add(label);
		add(point1);
		add(point2);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Draw area the game
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		g2.drawLine(400, 35, 400, 500);
		g2.drawLine(0, 35, 800, 35);
		// Set position labels
		label.setLocation(360, label.getY());
		point1.setLocation(370, 40);
		point2.setLocation(420, 40);
		point1.setText(String.valueOf(pointL));
		point2.setText(String.valueOf(pointR));
		draw(g2);
		update();
	}

	public void draw (Graphics2D g) {
		// Draw ball with method getBall and rackets
		g.fill(ball.getBall());
		g.fill(r1.getRacket());
		g.fill(r2.getRacket());
	}

	// Update the value for each iteration before the use method repaint
	public void update () {
		ball.moveBall(getBounds(), collision(r1.getRacket()), collision(r2.getRacket()));
		r1.moveRackedR1(getBounds());
		r2.moveRackedR2(getBounds());
	}
	
	private boolean collision (Rectangle2D r) {
		return ball.getBall().intersects(r);
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














