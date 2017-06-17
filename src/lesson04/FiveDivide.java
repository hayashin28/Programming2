/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年4月19日(金)												*
 *																			*
 * 【課題】																	*
 * 数字を入れると5で割った余りを計算し、「5で割った余りはXXXです。」と		*
 * 答えるプログラムを作成しなさい。											*
 ****************************************************************************/

package lesson04;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FiveDivide extends Applet implements ActionListener {
	//テキストフィールドを定義
	TextField textA, textB;

	public void init() {
		//テキストフィールドの生成と登録
		textA = new TextField("", 20);
		textA.addActionListener(this);
		add(textA);

		textB = new TextField("", 20);
		add(textB);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			//演算処理とテキストフィールドへの表示
			textB.setText("5で割った余りは"
					+ String.valueOf(Integer.parseInt(textA.getText()) % 5) + "です。");
		} catch(NumberFormatException exception) {
			//例外発生時の処理
			textB.setText("整数を入力してください。");
		}
	}
}
