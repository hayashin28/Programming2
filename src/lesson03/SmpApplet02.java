package lesson03;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SmpApplet02 extends Applet implements ActionListener {
	int counter = 1;
	Button incrementButton;

	public void init() { // (1)
		incrementButton = new Button("増やす");
		incrementButton.addActionListener(this);
		add(incrementButton);
	}

	public void paint(Graphics g) { // (2)
		for (int i = 0; i < counter; i++) {
			g.drawOval(i * 50 + 10, 50, 40, 40);
		}
	}

	public void actionPerformed(ActionEvent e) { // (3)
		counter++;
		repaint();
	}
}
