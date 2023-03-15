package clases;

public class ControlThread extends Thread {
	TableGame table;
	
	public ControlThread (TableGame table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		// repaint JFrame, for update positions in screen 
		while (true) {
			try {
				Thread.sleep(4);
			} catch (Exception e) {
				// TODO: handle exception
			}
			table.repaint();
		}
	}
}
