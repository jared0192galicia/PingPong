package clases;

import javax.swing.JFrame;

public class Window extends JFrame {

	private final int WIDTH = 800;
	private final int HEIGTH = 500;
	protected static ControlThread control;
	private TableGame table;
	
		// Constructor for Window
		public Window () {
			// Window properties
			this.setSize(WIDTH, HEIGTH);
			this.setTitle("Pong");
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			// Create component "JFrame"
			table = new TableGame();
			this.add(table);
			// Start controls (W, S, Up, Down, Esq)
			addKeyListener(new Controls());
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Create and start Thread the animation
			control = new ControlThread(table);
			 control.start();
			//table.iterateGame();
		}
}
