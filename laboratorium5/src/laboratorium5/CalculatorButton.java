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
				transition();
				
			}
		});
	}
	
	
	public void transition()  {
//		switch (Situation.state) {
			
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
