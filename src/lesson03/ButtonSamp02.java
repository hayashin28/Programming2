package lesson03;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ButtonSamp02 extends Applet implements ActionListener{

	// フィールド
	int size = 30;
	Button enlargeButton, contractButton;  // (1)

	// init メソッド
	public void init(){

		enlargeButton = new Button("拡大");
		enlargeButton.addActionListener(this);
		add(enlargeButton);

		// (2)
		contractButton = new Button("縮小");    // (i)
		contractButton.addActionListener(this); // (ii)
		add(contractButton);                    // (iii)
	}

	// paint メソッド
	public void paint(Graphics g){
		g.drawRect(30, 30, size, size);
	}

	// actionPerformed メソッド
	public void actionPerformed(ActionEvent e){
		// "拡大"が押されたとき
		if ( e.getSource() == enlargeButton){ // (3)
			size += 30;
		}
		// "縮小"が押されたとき
		else if ( e.getSource() == contractButton){
			size -= 30;
			if (size < 0) size = 0;
		}

		// 再描画(paintメソッドを実行する)
		repaint();
	}
}
