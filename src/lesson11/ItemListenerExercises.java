/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年5月31日(金)												*
 *																			*
 * 【課題】																	*
 * 「円」と「正方形」のチェックボックスを用意して，その選択に応じて			*
 *  赤色の円と緑色の正方形を描画するプログラムを作成しなさい。				*
 *  なお，チェックボックスをイベントソースにすること。						*
 ****************************************************************************/

package lesson11;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class ItemListenerExercises extends Applet implements ItemListener {

	//円と正方形のチェックボックスを定義
	Checkbox cbCircle = new Checkbox("円", true);
	boolean circle = true;
	Checkbox cbSquare = new Checkbox("正方形", false);
	boolean square = false;

	//init()メソッド
	public void init() {
		//円のチェックボックスをアイテムリスナーに登録
		cbCircle.addItemListener(this);
		add(cbCircle);

		//正方形のチェックボックスをアイテムリスナーに登録
		cbSquare.addItemListener(this);
		add(cbSquare);
	}

	//paint()メソッド
	public void paint(Graphics g) {
		//円の描画
		if (circle) {
			g.setColor(Color.red);
			g.fillOval(30, 30, 128, 128);
		}

		//長方形の描画
		if (square) {
			g.setColor(Color.green);
			g.fillRect(94, 30, 128, 128);
		}
	}

	//itemStateChanged()メソッド
	public void itemStateChanged(ItemEvent e) {
		//各チェックボックスの状態を取得
		circle = cbCircle.getState();	//円
		square = cbSquare.getState();	//長方形

		//再描画処理
		repaint();
	}
}
