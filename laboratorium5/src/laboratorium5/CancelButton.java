package laboratorium5;

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton {
	private Situation sit;
	

	public CancelButton(String buttonText, Situation sit) {
		super(buttonText, sit);
		this.sit = sit;
		this.buttonText = buttonText; 
		// TODO Auto-generated constructor stub}
	}
		
		
@Override 
public void transition() {
switch(this.sit.state) {

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
