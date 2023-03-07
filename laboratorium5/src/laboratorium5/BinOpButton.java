package laboratorium5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.function.IntBinaryOperator;

/**
 * @authors Clara Delfino, Nikolaos Gista
 */

@SuppressWarnings("serial")
public class BinOpButton extends CalculatorButton {
	private IntBinaryOperator binOp;

	public BinOpButton(String buttonText, Situation situation, IntBinaryOperator binOp) {
		// creates BinOpButton
		super(buttonText, situation);
		this.setText(buttonText);
		this.binOp = binOp;
	}

	public int resultat(int x, int y) {
//		 perform a operation between two int numbers and return the result of it
		return binOp.applyAsInt(x, y);
	}

	@Override
	public void transition() {
//		 perform actions based in which state the calculator is when the button is
//		 pressed
		switch (situation.state) {
		case Input1:
//			saves the number that is in the display in leftOperand, changes the state and the button's colour, and saves the binaryOperator 
			this.situation.leftOperand = this.situation.getDisplay();
			this.situation.state = State.OpReady;
			this.setColor(Color.RED);
			this.situation.binaryOperator = this;
			break;

		case OpReady:
//			change the colour of the previous button, set the pressed button as binaryOperator and changes its colour 
			this.situation.binaryOperator.setColor(Color.LIGHT_GRAY);
			this.situation.binaryOperator = this;
			this.setColor(Color.RED);
			break;

		case Input2:
//			do nothing
			break;

		case HasResult:
//			saves the value on display in leftOperand, changes the button's colour, the situation's state and situations's binary Operator
			this.situation.leftOperand = this.situation.getDisplay();
			this.situation.state = State.OpReady;
			this.setColor(Color.RED);
			this.situation.binaryOperator = this;
			break;

		default:
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {}

}
