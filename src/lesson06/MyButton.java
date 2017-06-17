package lesson06;

import java.awt.Button;

@SuppressWarnings("serial")
public class MyButton extends Button {
	private String txt;

	public MyButton(String txt) {
		super(txt);
		this.txt = txt;
	}

	public String getTxt() {
		return txt;
	}
}
