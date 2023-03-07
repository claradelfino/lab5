package laboratorium5;

import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 * @authors Clara Delfino, Nikolaos Gista
 */

@SuppressWarnings("serial")
public class EqualsButton extends CalculatorButton {

	public EqualsButton(String buttonText, Situation situation) {
		// create EqualsButton
		super(buttonText, situation);
		this.setText(buttonText);
	}

	@Override
	public void transition() {
		// perform actions based in which state the calculator is when the button is
		// pressed
		switch (situation.state) {
		case Input1:
			// do nothing
			break;

		case OpReady:
			// do nothing
			break;

		case Input2:
			// changes the colour of the binaryOperator, shows the result of the operation
			// in the display and changes the state
			this.situation.binaryOperator.setColor(Color.LIGHT_GRAY);
			int result = this.situation.binaryOperator.resultat(this.situation.leftOperand,
					this.situation.getDisplay());
			this.situation.setDisplay(result);
			this.situation.state = State.HasResult;
			break;

		case HasResult:
			// do nothing
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
