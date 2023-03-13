package clases;

import javax.swing.JFrame;

public class Window extends JFrame {

	private final int WIDTH = 800;
	private final int HEIGTH = 500;
	private Controls control;
	private TableGame table;
	
		public Window () {
			this.setSize(WIDTH, HEIGTH);
			this.setTitle("Pong");
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			table = new TableGame();
			add(table);
			control = new Controls(table);
			control.start();
		}
}
