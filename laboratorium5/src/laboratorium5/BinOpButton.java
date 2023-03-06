package laboratorium5;

import java.awt.event.ActionEvent;
import java.util.function.IntBinaryOperator;

@SuppressWarnings("serial")
public class BinOpButton extends CalculatorButton {
	IntBinaryOperator binOp;

	public BinOpButton(String buttonText, Situation situation, IntBinaryOperator binOp) {
		super(buttonText, situation);
		this.setText(buttonText);
		this.binOp = binOp;
		// TODO Auto-generated constructor stub
	}
	
	public int resultat(int x, int y, IntBinaryOperator op)  {
		return op.applyAsInt(x,  y);
	}
	
	@Override
	public void transition()  {
		switch (situation.state) {
			case Input1:
//				situation.leftOperand = situation.getDisplay();
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
