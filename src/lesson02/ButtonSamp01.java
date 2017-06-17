package lesson02;

import java.applet.*;
import java.awt.*;

/**
 * まず、イベント処理を行うアプレットを作るために、イベントを扱うための
 * クラスが含まれるjava.awt.eventパッケージをインポートしておく。
 */
import java.awt.event.*;

/**
 * Javaアプレットでイベント処理を行うにはリスナークラスが必要で、
 * 「ボタンを押した」というイベントを処理するにはActionListener
 * インターフェースから実装したクラスを使う、ということだった。
 * ここではButtonSamp01というアプレットクラスに、 ActionListener
 * インターフェースを実装している。
 * (ButtonSamp01クラスをActionListenerインターフェースから拡張して
 * 定義することで、実装している。)
 */
@SuppressWarnings("serial")
public class ButtonSamp01 extends Applet implements ActionListener {

	/**
	 * クラスの内側で、かつメソッドの外側で宣言されている変数を
	 * フィールド(あるいはフィールド変数)という。フィールドは、
	 * そのクラスのすべてのメソッドから使うことが出来る。
	 * 変数の値はクラスが生成されてから消滅するまで保持される。
	 */
	//フィールド
	int size = 30;
	Button enlargeButton;

	public void init() {
		// Buttonクラスのインスタンスを生成する
		enlargeButton = new Button("拡大");

		/**
		 * ButtonクラスのインスタンスにActionListener
		 * (ここではアプレット)を登録する
		 */
		enlargeButton.addActionListener(this);

		/**
		 * Buttonクラスのインスタンス(enlargeButton)を
		 * アプレットに登録する
		 * (ボタンがアプレットに表示される)
		 */
		add(enlargeButton);
	}

	public void paint(Graphics g) {
		// size x sizeの四角形を描画する
		g.drawRect(30, 30, size, size);
	}

	public void actionPerformed(ActionEvent e) {
		// size x sizeの四角形を描画する
		size += 30;

		// 再描画(paintメソッドが実行される)
		repaint();
	}
}
