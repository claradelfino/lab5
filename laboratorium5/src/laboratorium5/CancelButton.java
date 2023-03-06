package laboratorium5;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton {
	private Situation sit;
	

	public CancelButton(String buttonText, Situation sit) {
		super(buttonText, sit);
		this.setText(buttonText);		// TODO Auto-generated constructor stub}
	}
		// TODO Auto-generated constructor stub
		
		
	@Override
	public void transition()  {
//		switch
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

