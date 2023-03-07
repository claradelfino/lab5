package laboratorium5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/*
 * @authors Clara Delfino, Nikolaos Gista
 */

@SuppressWarnings("serial")
public abstract class CalculatorButton extends JButton implements ActionListener {
	String buttonText;
	Situation situation;
	Font font = new Font("Verdana", Font.BOLD, 20);

	public CalculatorButton(String buttonText, Situation situation) {
		this.buttonText = buttonText;
		this.situation = situation;
		this.setFont(font);
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(40, 40);

		// add an ActionListener to the buttons (all of them)
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CalculatorButton) e.getSource()).transition();

			}
		});
	}

	// reset display to zero
	public void resetToZero() {
		this.situation.display.setText("0");
	}

	// the method transition is implemented in the other button classes
	public void transition() {}

	// change the colour of the button
	public void setColor(Color newColor) {
		this.setBackground(newColor);
	}

	// return the label of the button
	@Override
	public String toString() {
		return buttonText;

	}
}
