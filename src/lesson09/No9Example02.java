package lesson09;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class No9Example02 extends Applet {
	public void paint(Graphics g) {
		// 身長を格納する配列の宣言
		double[] height = { 175.2, 170.5, 167, 9, 180.0, 172.4 };

		// 体重を格納する配列の宣言
		double[] weight = { 75.2, 56.5, 67, 2, 91.0, 57.7, 78.3 };

		// 最大値を格納する変数maxValueの宣言と身長の最大値を取得
		double maxValue = maxArray(height);

		// 身長の最大値を表示
		g.drawString("身長の最大値：" + maxValue, 20, 20);

		// 最大値を格納する変数maxValueの宣言と体重の最大値を取得
		maxValue = maxArray(weight);

		// 体重の最大値を表示
		g.drawString("体重の最大値：" + maxValue, 20, 40);
	}

	// 最大値を求めるメソッドmaxArray
	double maxArray(double[] data) {

		// 最大値を格納する変数maxの宣言と初期化
		double max = data[0];

		// 最大値を検索
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}

		// 最大値を返す
		return max;
	}
}
