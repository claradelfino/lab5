package laboratorium5;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DigitButton extends CalculatorButton {

	public DigitButton(String buttonText, Situation situation) {
		super(buttonText, situation);
		this.setText(buttonText);
		situation.display.setText(buttonText);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void transition()  {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
