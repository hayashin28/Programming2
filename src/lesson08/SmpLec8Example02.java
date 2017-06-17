package lesson08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SmpLec8Example02 extends Applet implements ActionListener {

	int[][] rectangle;
	Button resetButton;

	public void init() {
		rectangle = new int[5][2];

		resetButton = new Button("�Đݒ�");
		resetButton.addActionListener(this);
		add(resetButton);

		for (int i = 0; i < rectangle.length; i++) {
			for (int j = 0; j < rectangle[i].length; j++) {
				rectangle[i][j] = 10 + (int) (Math.random() * 90);
			}
		}
	}

	public void paint(Graphics g) {
		int x = 50;
		int y = 50;

		for (int i = 0; i < rectangle.length; i++) {
			g.drawRect(x, y, rectangle[i][0], rectangle[i][1]);
			x += rectangle[i][0];
			y += rectangle[i][1];
		}
	}

	public void actionPerformed(ActionEvent ev) {
		for (int i = 0; i < rectangle.length; i++) {
			for (int j = 0; j < rectangle[i].length; j++) {
				rectangle[i][j] = 10 + (int) (Math.random() * 90);
			}
		}
		repaint();
	}
}
