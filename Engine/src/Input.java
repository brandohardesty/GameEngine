import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements KeyListener,MouseListener {
	public int xClick;
	public int yClick;
	public boolean[] keysDown; // 0 is w, 1 is s, 2 is a, 3 is d, and 4 is space bar
	public Input() {
		xClick = 0;
		yClick = 0;
		keysDown = new boolean[5];
		for(int i=0; i<keysDown.length;i++) { // initially all the keys held down are false
			keysDown[i] = false;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			keysDown[4] = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			keysDown[0] = true;
			
			
		
			
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			keysDown[2] = true;
			
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			keysDown[3] = true;
			
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			keysDown[1] = true;
			
		}
		
		
		}
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			keysDown[4] = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			keysDown[0] = false;
			
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			keysDown[2] = false;
			
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			keysDown[3] = false;
			
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			keysDown[1] = false;
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		xClick = e.getX();
		yClick = e.getY();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] getClickLoc() {
		int[] loc = new int[2];
		loc[0] = xClick;
		loc[1] = yClick;
		return loc;
	}

}
