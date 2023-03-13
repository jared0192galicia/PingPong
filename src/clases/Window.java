package clases;

import javax.swing.JFrame;

public class Window extends JFrame {

	private final int WIDTH = 800;
	private final int HEIGTH = 500;
	private ControlThread control;
	private TableGame table;
	
		public Window () {
			this.setSize(WIDTH, HEIGTH);
			this.setTitle("Pong");
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			table = new TableGame();
			this.add(table);
			addKeyListener(new Controls());
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			control = new ControlThread(table);
			 control.start();
			//table.iterateGame();
		}
}
