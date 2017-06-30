package org.csv.ui;

import javax.swing.JFrame;

import org.csv.ui.view.MyPanel;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
    
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		this.setContentPane(new MyPanel());
		this.setVisible(true);	
	}
	
}
