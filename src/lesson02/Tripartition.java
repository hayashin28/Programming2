/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年4月17日(水)												*
 *																			*
 * 【課題】																	*
 * ボタンを押すと全ての四角形を3等分するプログラムを作成せよ。				*
 * ただし、四角形の幅は最初243とし、幅が3より小さくなった場合は				*
 * 初期状態（幅243の赤い四角形）に戻るようにすること。						*
 ****************************************************************************/

package lesson02;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Tripartition extends Applet implements ActionListener {

	final int SIZE = 243;
	int size = SIZE;
	Button button;

	public void init() {
		button = new Button("分割");
		button.addActionListener(this);
		add(button);
	}

	public void paint(Graphics g) {

		int cnt = 0;
		int tmp = 0;

		while (0 < SIZE - tmp) {
			switch (cnt) {
			case 0:
				g.setColor(Color.red);
				cnt++;
				break;
			case 1:
				g.setColor(Color.green);
				cnt++;
				break;
			case 2:
				g.setColor(Color.blue);
				cnt = 0;
				break;
			}

			g.fillRect(tmp, 50, size, 50);
			tmp += size;
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (size / 3 == 0) {
			size = SIZE;
		} else {
			size /= 3;
		}
		repaint();
	}

}
