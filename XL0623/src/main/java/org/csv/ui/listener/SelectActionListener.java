package org.csv.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;

public class SelectActionListener implements ActionListener {

	private class CsvFileFilter extends FileFilter{

		@Override
		public boolean accept(File f) {
			// TODO Auto-generated method stub
			return f.getName().endsWith(".csv");
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return ".csv";
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jFileChooser = new JFileChooser(new File("C:\\Users\\FXL\\Desktop"));
		jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jFileChooser.showDialog(new JLabel(), "选择");
		jFileChooser.setFileFilter(new CsvFileFilter());
		File f = jFileChooser.getSelectedFile();
		if(null!=f){
			System.out.println(f.getAbsolutePath());
		}
	}

}
