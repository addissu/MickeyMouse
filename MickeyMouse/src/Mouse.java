import java.awt.Color;
import java.awt.Graphics;

public class Mouse {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(400,500);
		Graphics g = panel.getGraphics();
		
		panel.setBackground(Color.yellow);
		
		g.setColor(Color.BLUE);
		g.fillOval(60, 40, 60, 60);
		g.fillOval(170, 40, 60, 60);
		g.setColor(Color.RED);
		g.fillRect(100, 75, 100, 100);
		g.setColor(Color.black);
		g.drawLine(100,125,200,125);
		
		

	}

}
