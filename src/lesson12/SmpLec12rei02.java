package lesson12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class SmpLec12rei02 extends Applet implements ActionListener, MouseListener {

	int[][] cor = new int[2][2];
	int shapeType = 0;
	String operations = "";
	Button clearButton = new Button("クリア");

	public void init() {
		//マウスのリスナークラス(アプレット自身)をaddMouseListenerメソッドで登録
		addMouseListener(this);
		//クリアボタンにリスナークラスとしてアプレット自身(this)を登録
		clearButton.addActionListener(this);
		add(clearButton);
	}

	/**
	 * shapeTypeが1の時はマウスのボタンを押した座標(cor[0][0], cor[0][1])を中心とする
	 * 一辺の長さが50の四角形を描画する。
	 * shapeTypeが2の時はマウスのボタンを離した位置(cor[1][0], cor[1][1])を中心とする
	 * 直径50の円を描画する。
	 */
	public void paint(Graphics g) {
		if (shapeType == 1) {
			g.drawRect(cor[0][0] - 25, cor[0][1] - 25, 50, 50);
		} else if (shapeType == 2) {
			g.drawOval(cor[1][0] - 25, cor[1][1] - 25, 50, 50);
		}
		g.drawString(operations, 10, 40);
	}

	//イベント信号のソースがクリアボタンならフィールド変数operationsを初期化して再描画
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			operations = "";
			repaint();
		}
	}

	/****************************************************************************
	 * mouseReleased	：マウスのボタンを離したときに呼び出される				*
	 * mouseClicked	 	：マウスのボタンをクリックしたときに呼び出される		*
	 * mouseEntered 	：マウスがコンポーネントの中に入ったときに呼び出される	*
	 * mouseExited		：マウスがコンポーネントの外に出たとき呼び出される		*
	 ****************************************************************************/

	//フィールド変数shapeTypeに四角形を描画するように1を代入
	public void mousePressed(MouseEvent e) {
		shapeType = 1;
		/**
		 * マウスが押された位置のx座標を格納するcor[0][0]にMouseEventクラスのgetXメソッドにより取得
		 * マウスを押した位置のx座標を代入
		 * 同様にy座標を格納するcor[0][1]にgetYメソッドでy座標を代入
		 */
		cor[0][0] = e.getX();
		cor[0][1] = e.getY();

		//mousePressedメソッドが呼ばれたことを示す文字“P”を追加
		operations += "P";
		repaint();
	}

	//フィールド変数shapeTypeに円形を描画するように2を代入
	public void mouseReleased(MouseEvent e) {
		shapeType = 2;
		cor[1][0] = e.getX();
		cor[1][1] = e.getY();

		operations += "R";
		repaint();
	}


	public void mouseClicked(MouseEvent e) {
		operations += "C";
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
		operations += "E";
		repaint();
	}

	public void mouseExited(MouseEvent e) {
		operations += "X";
		repaint();
	}
}
