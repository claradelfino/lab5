package laboratorium5;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DigitButton extends CalculatorButton {

	public DigitButton(String buttonText, Situation situation) {
		super(buttonText, situation);
		this.setText(buttonText);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void transition()  {
//		super.situation.display.setText(buttonText);
		String displayText =  situation.display.getText();

		switch (situation.state) {
			case Input1:
//				super.resetToZero();
				if (displayText == "0") {
					super.situation.display.setText(buttonText);
				} else {
					super.situation.display.setText(displayText + buttonText);
				}
				
				break;
			case OpReady:
				super.situation.display.setText(buttonText);
				situation.state = State.Input2;
				break;
			case Input2:
				break;
			case HasResult:
				break;
	}
	
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
