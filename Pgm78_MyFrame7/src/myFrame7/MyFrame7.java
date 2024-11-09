package myFrame7;

import java.awt.*;
import java.awt.event.*;

public class MyFrame7 extends Frame {
	private Button b1,b2,b3;
	
	public MyFrame7(String n) {
		super(n);
		
		setBackground(Color.white);
		setBounds(400,300,500,400);
		b1=new Button("Red");
		b2=new Button("Blue");
		b3=new Button("Green");
		
		setLayout(null);
		add(b1);
		add(b2);
		add(b3);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.red);
			}
				
			
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.blue);
			}
			
		});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.green);			}
			
		});
		
		
		
		b1.setBackground(Color.red);
		b1.setBounds(50,350,100,40);
		b2.setBackground(Color.blue);
		b2.setBounds(200,350,100,40);
		b3.setBackground(Color.green);
		b3.setBounds(350,350,100,40);
		
		setVisible(true);
	}

}
