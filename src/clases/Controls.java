package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controls extends KeyAdapter {

	static boolean w;
	static boolean s;
	static boolean up;
	static boolean down;

	
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
	}

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
