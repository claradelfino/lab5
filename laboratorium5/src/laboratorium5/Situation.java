package laboratorium5;

import javax.swing.*;

public class Situation {
	State state = State.Input1;
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;
	
	Situation(JLabel display) {
		this.display = display;
	}
}

