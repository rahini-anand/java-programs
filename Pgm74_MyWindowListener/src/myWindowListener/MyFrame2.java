package myWindowListener;

import java.awt.*;

public class MyFrame2 extends Frame{
	
	public MyFrame2(String n) {
		super(n);
		MyWindowListener m=new MyWindowListener(this);
		setBackground(Color.black);
		setBounds(400,200,500,300);
		addWindowListener(m);
		setVisible(true);
	}

}
