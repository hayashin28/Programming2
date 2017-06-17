/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年6月1日(土)												*
 *																			*
 * 【課題】																	*
 * マウスのボタンを押した時その位置を中心とする赤い丸、						*
 * そしてマウスのボタンを離した時その位置を中心とする青い＋を描画する		*
 * アプレットを作りなさい。													*
 ****************************************************************************/

package lesson12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MouseEventExercises extends Applet implements MouseListener {

	//変数を定義
	int[][] point = new int[2][2];	//座標取得
	int type = 0;					//イベント制御

	//初期化処理
	public void init() {
		//マウスイベントを登録
		addMouseListener(this);
	}

	//描画処理
	public void paint(Graphics g) {
		if (type == 1) {
			g.setColor(Color.red);
			g.drawOval(point[0][0] -50, point[0][1] - 50, 100, 100);
		} else if (type == 2) {
			g.setColor(Color.blue);
			//横線(X軸のみ中心から-50と+50)
			g.drawLine(point[0][0] -50, point[0][1], point[0][0] + 50, point[0][1]);
			//縦線(Y軸のみ中心から-50と+50)
			g.drawLine(point[0][0], point[0][1] - 50, point[0][0], point[0][1] + 50);
		}
	}

	//マウス押下時の処理
	public void mousePressed(MouseEvent e) {
		type = 1;
		point[0][0] = e.getX();
		point[0][1] = e.getY();

		repaint();
	}

	//マウスを離した時の処理
	public void mouseReleased(MouseEvent e) {
		type = 2;
		point[0][0] = e.getX();
		point[0][1] = e.getY();

		repaint();
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
