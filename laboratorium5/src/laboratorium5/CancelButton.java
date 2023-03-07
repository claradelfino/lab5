package laboratorium5;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @authors Clara Delfino, Nikolaos Gista
 */

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton {

	public CancelButton(String buttonText, Situation situation) {
//		 creates CancelButton
		super(buttonText, situation);
		this.setText(buttonText);
	}

	@Override
	public void transition() {
		switch (situation.state) {
//		 perform actions based in which state the calculator is when the button is
//		 pressed
		case Input1:
//			 reset to zero
			this.resetToZero();
			break;

		case OpReady:
//			 reset to zero, changes the button's colour and set the state to Input1
			this.resetToZero();
			this.situation.binaryOperator.setColor(Color.LIGHT_GRAY);
			this.situation.state = State.Input1;
			break;

		case Input2:
//			 reset to zero, changes the button's colour and set the state to Input1
			this.resetToZero();
			this.situation.binaryOperator.setColor(Color.LIGHT_GRAY);
			this.situation.state = State.Input1;
			break;

		case HasResult:
//			 reset to zero, changes the state to Input1
			this.resetToZero();
			this.situation.state = State.Input1;
			break;

		default:
			break;

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
