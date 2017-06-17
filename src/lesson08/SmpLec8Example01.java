package lesson08;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SmpLec8Example01 extends Applet {
	public void paint(Graphics g) {

		double[][] body = { { 170.0, 60.0 }, { 180.0, 85.0 }, { 165.0, 58.0 },
				{ 156.0, 49.0 }, { 175.0, 80.0 } };

		double[] average = new double[2];
		average[0] = average[1] = 0.0;

		for (int i = 0; i < body.length; i++) {
			for (int j = 0; j < body[i].length; j++) {
				average[j] += body[i][j];
			}
		}

		average[0] = average[0] / body.length;
		average[1] = average[1] / body.length;

		g.drawString("身長の平均:" + average[0] + ",体重の平均:" + average[1], 10, 20);
	}
}
