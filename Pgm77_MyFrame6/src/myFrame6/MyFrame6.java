package myFrame6;

import java.awt.*;
import java.awt.event.*;

public class MyFrame6 extends Frame {
	private Button b1,b2,b3,b4;
	
	public MyFrame6(String n) {
		super(n);
		setBackground(Color.white);
		setBounds(400,300,500,400);
		b1=new Button("Max");
		b2=new Button("Min");
		b3=new Button("Normal");
		b4=new Button("Close");
		setLayout(null);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
			}
			
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.ICONIFIED);
			}
			
		});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.NORMAL);
			}
			
		});
		
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		
		b1.setBackground(Color.green);
		b1.setBounds(10,300,100,40);
		b2.setBackground(Color.blue);
		b2.setBounds(120,300,100,40);
		b3.setBackground(Color.yellow);
		b3.setBounds(230,300,100,40);
		b4.setBackground(Color.red);
		b4.setBounds(340,300,100,40);
		
		setVisible(true);
		
		
	}

}
