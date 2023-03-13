package clases;

public class Controls extends Thread {
	TableGame table;
	
	public Controls (TableGame table) {
		this.table = table;
	}
	
	@Override
	public void run() {
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
