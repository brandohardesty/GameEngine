import javax.swing.JFrame;

public class Game {
	static Input input;
	static Window window;
	static boolean isRunning;
	public static Player player;
	
	public static void update() {
		if(Game.input.keysDown[0]) {
			Game.player.move(0, -2);
		}
		if(Game.input.keysDown[1]) {
			Game.player.move(0, 2);
		}
		if(Game.input.keysDown[2]) {
			Game.player.move(-2, 0);
		}
		if(Game.input.keysDown[3]) {
			Game.player.move(2, 0);
		}
		if(Game.input.keysDown[4]) {
			Game.player.attack();
		}
		
		
	}

	public static void render() {
		
		Game.window.getScreen().repaint();
		
		
	}


	public static void main(String[] args) {
	    input = new Input();
		
		isRunning = true;
		player = new Player();

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
