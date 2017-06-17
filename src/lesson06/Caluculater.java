package lesson06;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
//簡易電卓
public class Caluculater extends Applet implements ActionListener {

	TextField text1, text2, text3;
	MyButton add, suba, div;

	public void init() {
		//テキストフィールドをインスタンス化
		text1 = new TextField("", 4);
		text2 = new TextField("", 4);
		text3 = new TextField("", 4);

		//テキストフィールドを表示
		add(text1);
		add(text2);

		//ボタンをインスタンス化
		add  = new MyButton("＋");
		suba = new MyButton("－");
		div  = new MyButton("÷");

		//ボタンを表示
		add(this.add);
		add(suba);
		add(div);

		add(text3);

		//ボタンのイベントを登録
		add.addActionListener(this);
		suba.addActionListener(this);
		div.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ev) {

		try {

			double num1 = Double.parseDouble(text1.getText());
			double num2 = Double.parseDouble(text2.getText());

			if (ev.getSource() == add) {

			} else if (ev.getSource() == suba) {

			} else if (ev.getSource() == div) {
				text3.setText(String.valueOf(num1 / num2));
			}
		} catch (NumberFormatException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
