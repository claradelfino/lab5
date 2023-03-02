package laboratorium5;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;


public class GUI extends JFrame {
	
	private JPanel canvas, keyPad;
	private JLabel display;
	private JButton[] buttons = new JButton[16];
	GridBagConstraints c = new GridBagConstraints();

	
	public GUI () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	this.canvas = new JPanel();
    	this.canvas.setPreferredSize(new Dimension(420,550));
		canvas.setLayout(new GridBagLayout());
		this.setContentPane(canvas);
		canvas.setBackground(Color.GRAY);

		
		display = new JLabel("yy");
		JTextField display = new JTextField();

		display.setLayout(new GridLayout(4,4,10,10));;
		display.setOpaque(true);
		display.setBackground(Color.WHITE);
		canvas.add(display);
		
		this.setVisible(true);
		this.pack();
}


}

