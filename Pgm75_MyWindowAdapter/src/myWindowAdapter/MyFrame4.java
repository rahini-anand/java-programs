package myWindowAdapter;

import java.awt.*;
import java.awt.event.*;

public class MyFrame4 extends Frame {

	public MyFrame4(String n) {
		super(n);
	
		setBackground(Color.red);
		setBounds(400,200,500,300);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		setVisible(true);
	}
}
