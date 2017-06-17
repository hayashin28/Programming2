package lesson04;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

@SuppressWarnings("serial")
public class HowOld extends Applet implements ActionListener {
	//フィールド
	TextField fyear, fage;

	public void init() {
		//TextFieldクラスのオブジェクトの生成
		fyear = new TextField("", 4);

		/**
		 * TextFieldクラスのオブジェクトに
		 * ActionListener(ここではアプレット)を登録する */
		fyear.addActionListener(this);

		/**
		 * TextFieldクラスのオブジェクト(fyear)をアプレットに登録する
		 * (テキストフィールドがアプレットに表示される) */
		add(fyear);

		//TextFieldクラスのオブジェクトの生成
		fage = new TextField("", 4);

		/**
		 * TextFieldクラスのオブジェクト(fage)をアプレットに登録する
		 * (テキストフィールドがアプレットに表示される) */
		add(fage);
	}

	public void actionPerformed(ActionEvent e) {
		//カレンダークラスのオブジェクトの生成
		Calendar now = Calendar.getInstance();

		//現時点の年を得る
		int nowYear = now.get(Calendar.YEAR);

		//テキストフィールドから誕生日の年を得て整数に変換する
		int birthYear = Integer.parseInt(fyear.getText());

		//テキストフィールドに年齢を出力
		fage.setText((nowYear - birthYear) + "才");
	}
}
