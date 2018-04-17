import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame {
	private int width;
	private int height;
	private String title;
	public Screen screen;
	JButton button;
	
	public Window(int width,int height,String title) {
		super(title);
		width = width;
		height = height;
		title = title;
		setLayout(new FlowLayout());
		
		screen = new Screen();
		button = new JButton("hey");
		add(screen);
		add(button);
		

		

		
		
		addKeyListener(Game.input);
		addMouseListener(Game.input);
		
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width,height);
		
		
		
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	

	

}
