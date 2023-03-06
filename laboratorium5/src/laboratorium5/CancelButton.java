package laboratorium5;

import java.awt.Color;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton {
	private Situation sit;

	public CancelButton(String buttonText, Situation sit) {
		super(buttonText, sit);
		this.setText(buttonText); // TODO Auto-generated constructor stub}
	}
	// TODO Auto-generated constructor stub

	@Override
	public void transition() {
		switch (sit.state) {
		case HasResult:
			sit.state = State.Input1; 
			super.resetToZero(); 
			break;
		case Input1:
			super.resetToZero();
			break;
		case Input2:
			sit.state = State.Input1;
			super.resetToZero();
			break;
		case OpReady:
			sit.state = State.Input1; 
			super.resetToZero();

			super.setColor(Color.LIGHT_GRAY);
			break;
		default:
			break;

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
