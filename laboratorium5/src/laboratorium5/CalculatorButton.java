package laboratorium5;

import javax.swing.JButton;

@SuppressWarnings("serial")
public abstract class CalculatorButton extends JButton{
	String buttonText;
	Situation sit;
	
	public CalculatorButton(String buttonText, Situation sit) {
		this.buttonText = buttonText;
		this.sit = sit;
	}
	public abstract void transition() ;s
	public void setColor() {
		
	}
	
	public String toString() {
		return null;   //bara för att eclipse inte ska klaga
		
	}
}
