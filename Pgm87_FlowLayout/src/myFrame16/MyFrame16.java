package myFrame16;

import java.awt.*;

public class MyFrame16 extends Frame {
	
	private Panel p1;
	private Button b1,b2,b3,b4;
	private FlowLayout l;
	
	public MyFrame16(String n) {
		super(n);
		
		setBackground(Color.WHITE);
		setBounds(200,200,600,550);
		
		p1=new Panel();
		p1.setBounds(200,200,350,300);
		p1.setBackground(Color.GRAY);
		
		b1=new Button("A");
		b2=new Button("B");
		b3=new Button("C");
		b4=new Button("D");
		
		b1.setBackground(Color.RED);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.RED);
		b4.setBackground(Color.RED);
		
		b1.setForeground(Color.BLACK);
		b2.setForeground(Color.BLACK);
		b3.setForeground(Color.BLACK);
		b4.setForeground(Color.BLACK);
		
		l=new FlowLayout();
		p1.setLayout(l);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		add(p1);
		
		setVisible(true);
		
	}
	

}
