package clases;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuWindow extends JFrame{

	private JPanel panel = new JPanel();
	

	public MenuWindow() {
		this.setSize(400, 700);
		this.setLocationRelativeTo(null);
		this.setTitle("Ping Pong");
		this.setResizable(false);
		this.setVisible(true);
	}
}
