package org.csv.ui.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import org.csv.ui.listener.ExecuteActionListener;
import org.csv.ui.listener.SelectActionListener;

public class MyPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	private JButton jBtnSelect,jBtnBegin;//选择文件按钮，开始解析csv文件按钮；
	private JTextField jtextPath,jtextSavePath;//文件路径文本框，解析文件保存文件名；
	private JTextArea jtextArea;//解析日志文本
	private JLabel jLabel;//解析时间
	private JScrollPane jScrollPane;//日志滚动面板
	public MyPanel() {
		this.setLayout(null);
		initComponent();
	}
	
	//初始化组件
	private void initComponent(){
		jBtnSelect = new JButton("选择文件");
		jBtnBegin = new JButton("执行操作");
		jLabel = new JLabel("CSV");
		jScrollPane = new JScrollPane();
		jBtnSelect.setBounds(10, 20, 100, 30);
		jBtnBegin.setBounds(200, 400, 100, 30);
		jtextPath = new JTextField();
		jtextPath.setBounds(150, 20, 300, 30);
		jtextSavePath = new JTextField();
		jtextSavePath.setBounds(100, 80, 300, 30);
		jtextArea = new JTextArea();
		jtextArea.setBounds(0,0,400,200);
		jtextArea.setLineWrap(true);
		jtextArea.setWrapStyleWord(true);
		jScrollPane.setBounds(20, 180, 400, 200);
		jScrollPane.add(jtextArea);
		jLabel.setBounds(100, 150, 300, 30);
		jLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		initEventListener();
		
		this.add(jBtnSelect);
		this.add(jBtnBegin);
		this.add(jtextPath);
		this.add(jtextSavePath);
		this.add(jScrollPane);
		this.add(jLabel);
	}
	
	//初始化监听事件
	private void initEventListener(){
		jBtnSelect.addActionListener(new SelectActionListener());
		jBtnBegin.addActionListener(new ExecuteActionListener());
	}
}
