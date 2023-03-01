package laboratorium5;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.border.Border;


public class GUI extends JFrame {

	private JPanel canvas, keyPad;
	private JLabel display;
	private JButton[] buttons = new JButton[16];

	
	public GUI () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	this.canvas = new JPanel();
    	this.canvas.setPreferredSize(new Dimension(420,550));
		canvas.setLayout(new GridBagLayout());
		canvas.setBackground(Color.GRAY);

		this.setContentPane(canvas);
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.gridheight =50;
		c.gridwidth= 410;
		//c.gridheight = 200;
		//c.gridwidth = 200;
		this.display = new JLabel();
		//display.setBounds(50,25, 300, 50);
		c.gridx = 0;
		c.gridy = 0;
		c.gridheight =50;
		c.gridwidth= 410;
		display.setBackground(Color.WHITE);
		//Border b  = new Border(2);
		//display.setBorder();
		canvas.add(display, c);
		//canvas.add(c, display);
		this.keyPad = new JPanel();
	//	canvas.add(c);
		//this.display = new Display()
		
		this.setVisible(true);
		this.pack();
}


}

