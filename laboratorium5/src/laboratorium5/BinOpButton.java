package laboratorium5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.function.IntBinaryOperator;

@SuppressWarnings("serial")
public class BinOpButton extends CalculatorButton {
	IntBinaryOperator binOp;

	public BinOpButton(String buttonText, Situation situation, IntBinaryOperator binOp) {
		super(buttonText, situation);
		this.setText(buttonText);
		this.binOp =  binOp;
//		this.binOp = binOp;
		// TODO Auto-generated constructor stub
	}
	
	public int resultat(int x, int y, IntBinaryOperator op)  {
		return op.applyAsInt(x,  y);
	}
	

	@Override
	public void transition()  {
		String displayText =  situation.display.getText();
		switch (situation.state) {
			case Input1:
				situation.leftOperand = Integer.valueOf(displayText);
				super.setColor(Color.RED);
				break;
			case OpReady:
				super.setColor(Color.LIGHT_GRAY);
				break;
			case Input2:
				break;
			case HasResult:
				situation.leftOperand = Integer.valueOf(displayText);
				break;
	}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
