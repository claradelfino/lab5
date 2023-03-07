package laboratorium5;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * @authors Clara Delfino, Nikolaos Gista
 */

public class GUI extends JFrame {

	private JPanel canvas, keyPad;
	private JLabel display;

	Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
	Font font = new Font("Verdana", Font.BOLD, 18);

	public GUI() {
		super("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a JPanel named canvas
		this.canvas = new JPanel();
		this.setContentPane(canvas);
		this.canvas.setPreferredSize(new Dimension(500, 500));
		this.canvas.setLayout(new GridBagLayout());
		this.canvas.setBackground(Color.LIGHT_GRAY);

		// create a JLabel named display
		this.display = new JLabel();
		this.display.setBorder(border);
		this.display.setFont(font);
		this.display.setText("0");
		this.display.setHorizontalAlignment(SwingConstants.RIGHT);
		this.display.setBackground(Color.WHITE);
		this.display.setOpaque(true);

		// configure display
		GridBagConstraints grid = new GridBagConstraints();
		grid.fill = GridBagConstraints.BOTH;
		grid.weightx = 1;
		grid.weighty = 1;
		grid.gridx = 0;
		grid.gridy = 0;

		// create a JPanel named keyPad
		this.keyPad = new JPanel();
		this.keyPad.setLayout(new GridLayout(4, 4));

		// create the instance of situation that all the buttons are going to share, and
		// send the display as parameter
		Situation situation = new Situation(this.display);

		// create and add all the 16 buttons to the keypad (10 numbers, 4 operators, a
		// CancelButton and a EqualsButton)
		keyPad.add(new DigitButton("7", situation));
		keyPad.add(new DigitButton("8", situation));
		keyPad.add(new DigitButton("9", situation));
		keyPad.add(new BinOpButton("/", situation, (x, y) -> x / y));
		keyPad.add(new DigitButton("4", situation));
		keyPad.add(new DigitButton("5", situation));
		keyPad.add(new DigitButton("6", situation));
		keyPad.add(new BinOpButton("*", situation, (x, y) -> x * y));
		keyPad.add(new DigitButton("1", situation));
		keyPad.add(new DigitButton("2", situation));
		keyPad.add(new DigitButton("3", situation));
		keyPad.add(new BinOpButton("-", situation, (x, y) -> x - y));
		keyPad.add(new DigitButton("0", situation));
		keyPad.add(new EqualsButton("=", situation));
		keyPad.add(new CancelButton("C", situation));
		keyPad.add(new BinOpButton("+", situation, (x, y) -> x + y));

		// configure keyPad
		GridBagConstraints gridKeyPad = new GridBagConstraints();
		gridKeyPad.fill = GridBagConstraints.BOTH;
		gridKeyPad.weightx = 1;
		gridKeyPad.weighty = 10;
		gridKeyPad.gridx = 0;
		gridKeyPad.gridy = 1;

		// add display and keypad to canvas
		this.canvas.add(this.display, grid);
		this.canvas.add(this.keyPad, gridKeyPad);

		this.setVisible(true);
		this.pack();
	}

}
