import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		JPanel p = new JPanel();
		JButton button = new JButton("button");
		Screen s = new Screen();
		frame.add(s);
		s.setBackground(Color.GREEN);
		p.setBackground(Color.BLUE);
		frame.add(button);
		frame.add(p);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

}
