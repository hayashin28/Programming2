/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年5月31日(金)												*
 *																			*
 * 【課題】																	*
 * 5人分の身長が1次元配列に格納されているものとする。						*
 * 身長の平均値を求めて表示するプログラムを作成せよ。						*
 * なお、averageArrayを作り、このメソッドを用いて平均値を求めること。		*
 ****************************************************************************/

package lesson09;

import java.applet.*;
import java.awt.*;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class AverageArray extends Applet {
	public void paint(Graphics g) {
		// 身長を格納する配列の宣言
		double[] height = { 172.3, 167.5, 182.5, 176.1, 169.3 };

		// 平均値を格納する変数maxValueの宣言と平均値を取得
		double average = averageArray(height);

		// 身長の最大値を表示
		g.drawString("身長の最大値：" + average, 20, 20);

	}

	// 平均値を求めるメソッドaverageArray
	double averageArray(double[] data) {

		double avg = 0.0;

		// 合計値を算出
		for (int i = 0; i < data.length; i++) {
			avg += data[i];
		}

		BigDecimal bd = new BigDecimal(String.valueOf(avg / data.length));

		// 平均値を返す(小数点第2位以下四捨五入)
		return bd.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
