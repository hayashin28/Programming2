package lesson11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class No11Sample02 extends Applet implements ItemListener {

	//フィールド
	Checkbox cb = new Checkbox("黒で塗りつぶす", false);
	boolean fill = false;

	//init()メソッド
	public void init() {
		cb.addItemListener(this);
		add(cb);
	}

	//paint()メソッド
	public void paint(Graphics g) {
		if (fill) {
			g.fillOval(30, 30, 50, 50);
		} else {
			g.drawOval(30, 30, 50, 50);
		}
	}

	//itemStateChanged()メソッド
	public void itemStateChanged(ItemEvent e) {
		fill = cb.getState();
		repaint();
	}
}
