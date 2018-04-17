import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame {
	
	private String title;
	public Screen screen;
	public Window(int width,int height,String title) {
		super(title);
	
		
		
		screen = new Screen();
		
		add(screen);
		
		
		

		

		
		
		addKeyListener(Game.input);
		addMouseListener(Game.input);
		
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width,height);
		
		
		
	}
	
	public Screen getScreen() {
		return screen;
	}
	

	

	

}
