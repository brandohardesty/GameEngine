import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player {
	private int health;
	private int speed;
	private int x;
	private int y;
	private Image img;
	public Player() {
		x = 400;
		y = 400;
		try {
			img = ImageIO.read(new File("src/Player.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void move(int ax,int ay) {
		x += ax;
		y += ay;
	}
	public void attack() {
		System.out.println("attacking");
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Image getImage() {
		return img;
	}

}
