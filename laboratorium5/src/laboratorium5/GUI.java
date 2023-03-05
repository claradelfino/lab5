package laboratorium5;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;


public class GUI extends JFrame {
	
	private JPanel canvas, keyPad;
	private JLabel display;
	private JButton[] buttons = new JButton[16];
	
	Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
	Font font = new Font("Verdana", Font.PLAIN, 18);

	
	public GUI () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	this.canvas = new JPanel();
    	this.canvas.setPreferredSize(new Dimension(500,500));
		this.canvas.setLayout(new GridBagLayout());
		this.setContentPane(canvas);
//		canvas.setBackground(Color.GRAY);
		
		
		this.display = new JLabel();
		this.display.setBorder(border);
		this.display.setText("test");
		this.display.setFont(font);
		this.display.setHorizontalAlignment(SwingConstants.RIGHT);
		this.display.setVerticalAlignment(SwingConstants.NORTH);
		
		GridBagConstraints grid = new GridBagConstraints();
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.weightx = 1;
		grid.weighty = 1;
		grid.gridx = 0;
		grid.gridy = 0;
//		display.setOpaque(true);
//		display.setBackground(Color.WHITE);
		this.canvas.add(this.display, grid);
		
		this.setVisible(true);
		this.pack();
}


}

