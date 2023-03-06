package laboratorium5;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EqualsButton extends CalculatorButton {

	public EqualsButton(String buttonText, Situation sit) {
		super(buttonText, sit);
		this.setText(buttonText);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void transition()  {
		String displayText =  situation.display.getText();
		switch (situation.state) {
			case Input1:
				break;
			case OpReady:
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
