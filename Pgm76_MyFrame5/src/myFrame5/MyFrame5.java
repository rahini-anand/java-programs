package myFrame5;

import java.awt.*;
import java.awt.event.*;

public class MyFrame5 extends Frame{
	
	private Button b;
	
	public MyFrame5(String n) {
		super(n);
		setBackground(Color.white);
		setBounds(400,300,600,500);
		b=new Button("Close");
		setLayout(null);
		b.setBackground(Color.green);
		b.setBounds(250,350,100,50);
		add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				dispose();
			}
		});
		setVisible(true);
	}
	

}
