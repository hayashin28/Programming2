package lesson10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class No9Example03 extends Applet implements ActionListener {
	// フィールド
	Button button;
	int[] data = { 5, 13, 9, 3 };

	// initメソッド
	public void init() {

		// Buttonクラスのオブジェクトをインスタンス化
		button = new Button("ソート");

		// ButtonクラスのインスタンスにActionListener(ここではアプレット)を登録する
		button.addActionListener(this);

		// Buttonクラスのインスタンス(button)をアプレットに登録する
		// (ボタンがアプレットに表示される)
		add(button);
	}

	// Paintメソッド
	public void paint(Graphics g) {
		// String型の変数の宣言
		String s = "配列の内容：";

		// 配列の中身を順にsに加える
		for (int i = 0; i < data.length; i++) {
			s += " " + data[i];
		}

		// 文字列sの表示
		g.drawString(s, 20, 50);
	}

	public void actionPerformed(ActionEvent ae) {
		// ascendingSortメソッドの呼び出し
		ascendingSort();

		// 再描画(paintメソッドが実行される)
		repaint();
	}

	// ascendingSortメソッド(昇順ソート)
	public void ascendingSort() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[i]) {
					int tmp = data[j];
					data[j] = data[i];
					data[i] = tmp;
				}
			}
		}
	}
}
