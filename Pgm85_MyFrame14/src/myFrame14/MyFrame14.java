package myFrame14;

import java.awt.*;
import java.awt.event.*;


public class MyFrame14 extends Frame{
	
	protected Label l1;
	protected Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	
	public MyFrame14(String n) {
		super(n);
		MyActionListener m=new MyActionListener(this);
		setBackground(Color.GRAY);
		setBounds(400,250,650,750);
		l1=new Label();
		
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		b11=new Button(".");
		b12=new Button("=");
		b13=new Button("+");
		b14=new Button("-");
		b15=new Button("*");
		b16=new Button("/");
		b17=new Button("Clear");
		
		l1.setBounds(50,100,550,100);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.WHITE);
		
		b9.setBounds(50,250,100,70);
		b8.setBounds(200,250,100,70);
		b7.setBounds(350,250,100,70);
		b13.setBounds(500,250,100,70);
		b6.setBounds(50,350,100,70);
		b5.setBounds(200,350,100,70);
		b4.setBounds(350,350,100,70);
		b14.setBounds(500,350,100,70);
		b3.setBounds(50,450,100,70);
		b2.setBounds(200,450,100,70);
		b1.setBounds(350,450,100,70);
		b15.setBounds(500,450,100,70);
		b10.setBounds(50,550,100,70);
		b11.setBounds(200,550,100,70);
		b12.setBounds(350,550,100,70);
		b16.setBounds(500,550,100,70);
		b17.setBounds(200,650,200,50);
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		
		
		
		setLayout(null);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b3.setBackground(Color.black);
		b4.setBackground(Color.black);
		b5.setBackground(Color.black);
		b6.setBackground(Color.black);
		b7.setBackground(Color.black);
		b8.setBackground(Color.black);
		b9.setBackground(Color.black);
		b10.setBackground(Color.black);
		b11.setBackground(Color.black);
		b12.setBackground(Color.black);
		b13.setBackground(Color.black);
		b14.setBackground(Color.black);
		b15.setBackground(Color.black);
		b16.setBackground(Color.black);
		b17.setBackground(Color.black);
		
		b1.addActionListener(m); 		
		b2.addActionListener(m);
		b3.addActionListener(m);
		b4.addActionListener(m);
		b5.addActionListener(m); 		
		b6.addActionListener(m);
		b7.addActionListener(m);
		b8.addActionListener(m);
		b9.addActionListener(m); 		
		b10.addActionListener(m);
		b11.addActionListener(m);
		b12.addActionListener(m);
		b13.addActionListener(m); 		
		b14.addActionListener(m);
		b15.addActionListener(m);
		b16.addActionListener(m);
		b17.addActionListener(m);
		
		add(l1);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		
		
		setVisible(true);
	}

}
