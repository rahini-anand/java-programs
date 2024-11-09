package myFrame17;

import java.awt.*;

public class MyFrame17 extends Frame {
	private Panel p1;
	private Button b1,b2,b3,b4;
	private BorderLayout l;
	
	public MyFrame17(String n) {
		super(n);
		
		setBackground(Color.BLACK);
		setBounds(200,200,600,550);
		
		p1=new Panel();
		p1.setBounds(200,200,350,300);
		p1.setBackground(Color.GRAY);
		
		b1=new Button("NORTH");
		b2=new Button("SOUTH");
		b3=new Button("EAST");
		b4=new Button("WEST");
		
		b1.setBackground(Color.GREEN);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.ORANGE);
		b4.setBackground(Color.YELLOW);
		
		b1.setForeground(Color.BLACK);
		b2.setForeground(Color.BLACK);
		b3.setForeground(Color.BLACK);
		b4.setForeground(Color.BLACK);
		
		l=new BorderLayout();
		p1.setLayout(l);
		
		p1.add(b1,BorderLayout.NORTH);
		p1.add(b2,BorderLayout.SOUTH);
		p1.add(b3,BorderLayout.EAST);
		p1.add(b4,BorderLayout.WEST);
		
		add(p1);
		
		setVisible(true);
		
	}

}
