package myFrame22;

import java.awt.*;

public class MyFrame22 extends Frame {
	
	public MyFrame22(String n) {
		super(n);
		
		setBounds(100,100,400,600);
		setBackground(Color.gray);
		
		MyMouse m=new MyMouse(this);
		
		addMouseListener(m);
		
		setLayout(null);
		setVisible(true);
	}

}
