package laboratorium5;

import java.awt.event.ActionEvent;

/**
 * @authors Clara Delfino, Nikolaos Gista
 */

@SuppressWarnings("serial")
public class DigitButton extends CalculatorButton {
	public DigitButton(String buttonText, Situation situation) {
		// create digitButton
		super(buttonText, situation);
		this.setText(buttonText);
	}

	@Override
	public void transition() {
//		 get the button's label
		String displayText = situation.display.getText();
//		 perform actions based in which state the calculator is when the button is
//		 pressed
		switch (situation.state) {

		case Input1:
//			 verify if the label is 0 or not, and set the display to show the button's
//			 label
			if (displayText == "0") {
				this.situation.display.setText(buttonText);
			} else {
				this.situation.display.setText(displayText + buttonText);
			}
			break;

		case OpReady:
			// set the display to show the label and then modify the state
			this.resetToZero();
			this.situation.display.setText(buttonText);
			this.situation.state = State.Input2;
			break;

		case Input2:
//			 verify if the label is 0 or not, and set the display to show the button's
//			 label
			if (displayText == "0") {
				this.situation.display.setText(buttonText);
			} else {
				this.situation.display.setText(displayText + buttonText);
			}
			break;

		case HasResult:
//			 set the display to show the label and then modify the state
			this.resetToZero();
			this.situation.display.setText(buttonText);
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
