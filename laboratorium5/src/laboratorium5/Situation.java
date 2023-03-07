package laboratorium5;

import javax.swing.*;

/*
 * @authors Clara Delfino, Nikolaos Gista
 */

public class Situation {
	State state = State.Input1;
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;

	Situation(JLabel display) {
		this.display = display;
	}

//	set a number to display (and transform in String) 
	public void setDisplay(int number) {
		this.display.setText(String.valueOf(number));

	}

//	get the string from the display and transform in int
	public int getDisplay() {
		return Integer.parseInt(this.display.getText());

	}

}
