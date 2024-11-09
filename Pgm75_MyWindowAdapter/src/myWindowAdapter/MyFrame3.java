package myWindowAdapter;

import java.awt.*;

public class MyFrame3 extends Frame {
	
	public MyFrame3(String n) {
		super(n);
		MyWindowAdapter m=new MyWindowAdapter(this);
		setBackground(Color.green);
		setBounds(400,200,500,400);
		addWindowListener(m);
		setVisible(true);
	}

}
