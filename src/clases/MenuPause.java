package clases;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuPause extends JFrame implements ActionListener {

	// Constants for the dimensions windows
	private static final int WIDTH = 400;
	private static final int HEIGTH = 300;
	
	private JLabel title;
	private Button buttContinue;
	
	public MenuPause () {
		// Set properties at window
		this.setSize(WIDTH, HEIGTH);
		this.setTitle("Pausa");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		initComponents();
	}
	
	// Method that creates the window components
	public void initComponents() {
		title = new JLabel("PAUSA");
		title.setFont(new Font("Areal", Font.BOLD, 20));
		title.setForeground(new Color(20, 20, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		title.setBounds(WIDTH/2-25, HEIGTH/2-15, 50, 30);
		
		buttContinue = new Button("Continuar");
		buttContinue.setBounds((WIDTH/2 - 30), (HEIGTH/2 - 15), 60, 30);
		buttContinue.addActionListener(this);
		this.add(buttContinue);
		this.add(title);
	}
	
	// EVENT that restart the game (resume in the thread)
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttContinue) {
			this.setVisible(false);
			Window.control.resume();
		}
		
	}
}



















