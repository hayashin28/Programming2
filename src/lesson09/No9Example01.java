package lesson09;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class No9Example01 extends Applet {
	public void paint(Graphics g) {
		// 身長を格納する配列の宣言
		double[] height = { 175.2, 170.5, 167, 9, 180.0, 172.4 };

		// 体重を格納する配列の宣言
		double[] weight = { 75.2, 56.5, 67, 2, 91.0, 57.7, 78.3 };

		// 最大値を格納する変数maxValueの宣言と初期化
		double maxValue = height[0];

		// 身長の最大値を検索
		for (int i = 1; i < height.length; i++) {
			if (maxValue < height[i]) {
				maxValue = height[i];
			}
		}

		// 身長の最大値を表示
		g.drawString("身長の最大値：" + maxValue, 20, 20);

		// 最大値を格納する変数maxValueの宣言と初期化
		maxValue = weight[0];

		// 体重の最大値を検索
		for (int i = 1; i < weight.length; i++) {
			if (weight[i] > maxValue) {
				maxValue = weight[i];
			}
		}

		// 体重の最大値を表示
		g.drawString("体重の最大値：" + maxValue, 20, 40);

	}
}
