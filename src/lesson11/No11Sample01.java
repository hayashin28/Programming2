package lesson11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class No11Sample01 extends Applet implements ActionListener {

	//フィールド
	double w0 = 80.0, h0 = 40.0;
	double w =w0, h = h0;
	Button enlargeButton = new Button("拡大");
	Button clearButton = new Button("元へ");
	Checkbox height = new Checkbox("縦");
	Checkbox width = new Checkbox("横");

	//init()メソッド
	public void init() {
		add(height);
		add(width);

		//イベントの登録
		enlargeButton.addActionListener(this);	//拡大
		add(enlargeButton);
		clearButton.addActionListener(this);	//戻す
		add(clearButton);
	}

	//paint()メソッド
	public void paint(Graphics g) {
		g.fillRect((int)(125 - w/2), (int)(100 - h/2), (int)w, (int)h);
	}

	//actionPerformed()メソッド
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enlargeButton) {

			if (height.getState()) {
				h *= 1.1;
			}

			if (width.getState()) {
				w *= 1.1;
			}
		} else {
			w = w0;	h = h0;
			height.setState(false);
			width.setState(false);
		}

		repaint();
	}

}
