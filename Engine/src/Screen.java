import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel {
	public Screen() {
		super();
		
		setBackground(Color.BLUE);
		setSize(800,800);
		setVisible(true);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.drawImage(Game.player.getImage(),Game.player.getX(),Game.player.getY(),null);
	}

}
