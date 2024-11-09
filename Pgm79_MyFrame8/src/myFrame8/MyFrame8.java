package myFrame8;

import java.awt.*;

import java.awt.Event.*;


public class MyFrame8 extends Frame {
	
	private Label l1,l2;
	
	public MyFrame8(String n) {
		super(n);
		setBackground(Color.green);
		setBounds(400,300,500,400);
		l1=new Label();
		l2=new Label();
		l1.setText("Name:Kavin");
		l2.setText("Address:Trichy");
		l1.setBounds(50,50,300,100);
		l2.setBounds(50,140,300,100);
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		l2.setFont(new Font(Font.SERIF,Font.ITALIC,20));
		l1.setForeground(Color.red);
		l2.setForeground(Color.orange);
		setLayout(null);
		add(l1);
		add(l2);
		setVisible(true);
		
		
		
		
	}

}
