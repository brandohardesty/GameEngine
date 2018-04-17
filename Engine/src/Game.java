import javax.swing.JFrame;

public class Game {
	static Input input;
	static Game game;
	static Window window;
	static boolean isRunning;
	
	public static void update() {
		System.out.println("Running");
		
	}

	public static void render() {
		System.out.println("Rendering");
		
	}

	public static void main(String[] args) {
		input = new Input();
		game = new Game();
		isRunning = true;

		window = new Window(800,800,"hey");
		window.setVisible(true);
		
		long start = 0;
		long stop = 0;
		while(isRunning) {
			start = System.currentTimeMillis();
			if(start - stop>16.67) {
				update();
				render();
				
				stop = System.currentTimeMillis();
			}
			
		}
		
	
		
		
	}



}
