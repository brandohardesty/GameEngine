import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel {
	public Screen() {
		super(new FlowLayout());
		
		setBackground(Color.BLUE);
		setSize(800,800);
		setVisible(true);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(100, 100, 100, 100);
	}

}
