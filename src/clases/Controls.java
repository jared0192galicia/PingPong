package clases;

import java.lang.Thread.State;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controls extends KeyAdapter {

	// Variables for the press keys
	static boolean w;
	static boolean s;
	static boolean up;
	static boolean down;
	private boolean pause = true;

	MenuPause menuPause;

	public Controls() {
		menuPause = new MenuPause();
	}
	
	// identifies the keys pressed
	@Override
	public void keyPressed (KeyEvent e) {
		int code = e.getKeyCode();

		if (code == KeyEvent.VK_W) {
			w = true;
		}
		if (code == KeyEvent.VK_S) {
			s = true;
		}
		if (code == KeyEvent.VK_UP) {
			up = true;
		}
		if (code == KeyEvent.VK_DOWN) {
			down = true;
		}
		if (code == KeyEvent.VK_ESCAPE) {
			if (pause) {				
				Window.control.suspend();
				menuPause.setVisible(true);
			} else {
				Window.control.resume();
				menuPause.setVisible(true);
			}
			pause = !pause;
		}
	}

//	identifies the keys released
	@Override
	public void keyReleased (KeyEvent e) {
		int code = e.getKeyCode();

		if (code == KeyEvent.VK_W) {
			w = false;
		}
		if (code == KeyEvent.VK_S) {
			s = false;
		}
		if (code == KeyEvent.VK_UP) {
			up = false;
		}
		if (code == KeyEvent.VK_DOWN) {
			down = false;
		}
	}

}
