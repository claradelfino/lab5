package laboratorium5;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton {
	private Situation sit;
	

<<<<<<< HEAD
	public CancelButton(String buttonText, Situation sit) {
		super(buttonText, sit);
		this.sit = sit;
		this.buttonText = buttonText; 
		// TODO Auto-generated constructor stub}
=======
	public CancelButton(String buttonText, Situation situation) {
		super(buttonText, situation);
		this.setText(buttonText);
		// TODO Auto-generated constructor stub
>>>>>>> branch 'master' of https://github.com/claradelfino/lab5.git
	}
<<<<<<< HEAD
		
		
@Override 
public void transition() {
switch(this.sit.state) {
=======
	@Override
	public void transition()  {
//		switch
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
>>>>>>> branch 'master' of https://github.com/claradelfino/lab5.git

case HasResult:
	this.sit.state = State.Input1;
	int value = 0;
	this.sit.setDispay(value);	
	break;
case Input1:
	int value1 = 0;
	this.sit.setDispay(value1);
	break;
}
}
}
