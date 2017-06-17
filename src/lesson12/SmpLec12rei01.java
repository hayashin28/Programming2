package lesson12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SmpLec12rei01 extends Applet implements MouseListener {

	int[] cor = new int[2];

	public void init() {
		addMouseListener(this);
		cor[0] = -1;
	}

	public void paint(Graphics g) {
		if (cor[0] >= 0) {
			g.drawOval(cor[0] - 25, cor[1] - 25, 50, 50);
		}
	}

	public void mousePressed(MouseEvent e) {
		cor[0] = e.getX();
		cor[1] = e.getY();
		repaint();
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
