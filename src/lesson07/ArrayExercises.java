/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年4月24日(水)												*
 *																			*
 * 【課題】																	*
 * 5つ以上の要素を持つ整数型の配列を宣言して初期化し、配列に格納されている	*
 * 値を辺の長さとする正方形を描くアプレットを作成しなさい。					*
 * なお正方形の色は交互に赤青とすること。									*
 ****************************************************************************/

package lesson07;

import java.applet.*;
import java.awt.*;
import java.util.Random;

@SuppressWarnings("serial")
public class ArrayExercises extends Applet {

	public void paint(Graphics g) {

		//配列の宣言と生成
		int[] rect = new int[5];

		//乱数オブジェクトを生成
		Random rand = new Random();

		for (int i = 0; i < rect.length; i++) {
			//乱数の生成と配列への格納
			rect[i] = rand.nextInt(70) + 30;	//(30～99に調整)
		}

		int x = 0;	//開始位置のx座標
		for (int i = 0; i < rect.length; i++) {
			g.setColor(Color.blue);
			if ((i & 1) == 0) {
				g.setColor(Color.red);
			}

			g.fillRect(x, 0, rect[i], rect[i]);
			x += rect[i];
		}
	}

}
