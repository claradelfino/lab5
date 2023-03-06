package laboratorium5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public abstract class CalculatorButton extends JButton implements ActionListener {
	String buttonText;
	Situation situation;
	Color color;
	int size;
	Font font = new Font("Verdana", Font.BOLD, 20);
	
	public CalculatorButton(String buttonText, Situation situation) {
		this.buttonText = buttonText;
		this.situation = situation;
		this.setFont(font);
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(40, 40);
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CalculatorButton) e.getSource()).transition();
				
			}
		});
	}
<<<<<<< HEAD
	public abstract void transition() ;s
	public void setColor() {
=======
	// jag vet inte om resetToZero funkar
	public void resetToZero() {
		this.situation.display.setText("0");
	}
	
	public void transition()  {
		
>>>>>>> branch 'master' of https://github.com/claradelfino/lab5.git
		
			
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
