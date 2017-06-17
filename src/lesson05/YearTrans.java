package lesson05;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class YearTrans extends Applet implements ActionListener {

	//テキストフィールド
	TextField heiseiYear, graceYear;

	/**
	 * initは初期化(initialize)するために使われるメソッドで、
	 * アプレットプログラムを実行時の最初だけ呼ばれる。
	 */
	public void init() {
		//ラベルをアプレットに登録
		add(new Label("平成"));

		//TextFieldクラスのオブジェクトの生成
		heiseiYear = new TextField("", 4);

		/**
		 * TextFieldクラスのオブジェクトにActionListener
		 * (ここではアプレット)に登録する */
		heiseiYear.addActionListener(this);

		//TextFieldクラスのオブジェクトをアプレットに登録
		add(heiseiYear);

		//ラベルをアプレットに登録
		add(new Label("西暦"));

		//TextFieldクラスのオブジェクトの生成
		graceYear = new TextField("", 4);

		//TextFieldクラスのオブジェクトをアプレットに登録
		add(graceYear);
	}

	//エンターキーが押下時にactionPerformedメソッドが呼び出される。
	public void actionPerformed(ActionEvent e) {
		//テキストフィールドから平成の年号を得て整数に変換する
		int year = Integer.parseInt(heiseiYear.getText());
		graceYear.setText((1988 + year) + "年");
	}
}
