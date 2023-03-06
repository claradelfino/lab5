package laboratorium5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public abstract class CalculatorButton2 extends JButton implements ActionListener {
	String buttonText;
	Situation situation;
	Color color;
	int size;
	Font font = new Font("Verdana", Font.BOLD, 20);
	
	public CalculatorButton2(String buttonText, Situation situation) {
		this.buttonText = buttonText;
		this.situation = situation;
		this.setFont(font);
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(40, 40);
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CalculatorButton2) e.getSource()).transition();
				
			}
		});
	}


	// jag vet inte om resetToZero funkar
	public void resetToZero() {
		this.situation.display.setText("0");
	}
	
	public void transition()  {
		

		
			
//		}
	}
	public void setColor(Color newColor) {
		this.setBackground(newColor);
	}
	
	@Override
	public String toString() {
		
		return buttonText;   
		
	}
}
