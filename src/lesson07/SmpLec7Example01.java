package lesson07;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SmpLec7Example01 extends Applet {
	@Override
	public void paint(Graphics g) {
		// 配列の宣言と生成
		int[] number = new int[10];

		// 配列に乱数を使って値を設定する
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random() * 10) + 1;
			g.drawString(String.valueOf(number[i]), 30 * i, 30);
		}

		// 最大値を検索
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		
		add(new Label("最大値は " + max + "です。"));
	}
}