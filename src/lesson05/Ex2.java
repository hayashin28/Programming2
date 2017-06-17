package lesson05;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex2 extends Applet implements ActionListener {

	//テキストフィールド
	TextField text;

	int r = 0;	//直径

	public void init() {
		//ラベルをアプレットに登録
		add(new Label("直径"));

		//テキストフィールドをインスタンス化
		text = new TextField("", 4);

		//イベントに登録
		text.addActionListener(this);

		//アプレットに登録
		add(text);
	}

	public void paint(Graphics g) {
		g.fillOval(50, 50, r, r);
	}

	public void actionPerformed(ActionEvent ev) {
		try {
			r = Integer.parseInt(text.getText());
			repaint();
		} catch (NumberFormatException e) {}
	}
}
