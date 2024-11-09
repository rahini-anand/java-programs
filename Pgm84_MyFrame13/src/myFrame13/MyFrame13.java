package myFrame13;

import java.awt.*;
import java.awt.event.*;

public class MyFrame13 extends Frame {
	
	protected Label l1,l2,l3,l4;
	protected TextField t1,t2;
	protected Button b1,b2,b3,b4;

	
	public MyFrame13(String n) {
		super(n);
		MyActionListener m=new MyActionListener(this);
		setBackground(Color.black);
		setBounds(400,300,700,600);
		l1=new Label();
		l2=new Label();
		l3=new Label();
		l4=new Label();
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		t1=new TextField();
		t2=new TextField();
		
		l1.setText("A");
		l2.setText("B");
		l3.setText("Result");
		l1.setBounds(100,100,200,50);
		l2.setBounds(100,250,200,50);
		l3.setBounds(100,400,200,50);
		l4.setBounds(300,400,100,50);
		t1.setBounds(300,100,250,50);
		t2.setBounds(300,250,250,50);
		b1.setBounds(200,500,50,50);
		b2.setBounds(280,500,50,50);
		b3.setBounds(360,500,50,50);
		b4.setBounds(440,500,50,50);
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l2.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l3.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l4.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		setLayout(null);
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.red);
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		b1.addActionListener(m); 		
		b2.addActionListener(m);
		b3.addActionListener(m);
		b4.addActionListener(m);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(t1);
		add(t2);
		
		setVisible(true);
	}
}
