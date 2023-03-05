package laboratorium5;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton  {

	public CancelButton(String buttonText, Situation situation) {
		super(buttonText, situation);
		this.setText(buttonText);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void transition()  {
//		switch
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
