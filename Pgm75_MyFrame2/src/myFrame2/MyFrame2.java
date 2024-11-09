package myFrame2;

import java.awt.*;

import myWindowListener.MyWindowListener;

public class MyFrame2 extends Frame{
	
	public MyFrame2(String n) {
		super(n);
		MyWindowListener m=new MyWindowListener(this);
		setBackground(Color.black);
		setBounds(200,300,500,300);
		
		addWindowListener(m);
		setVisible(true);
		
	}
	
	

}
