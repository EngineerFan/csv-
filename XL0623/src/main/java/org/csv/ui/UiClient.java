package org.csv.ui;

import javax.swing.JFrame;

public class UiClient {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new MyFrame("CSV解析");
	}
}
