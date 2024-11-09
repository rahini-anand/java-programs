package myFrame19;

import java.awt.*;

import java.awt.event.*;

public class MyFrame19 extends Frame {
	
	protected Label l1,l2,l3,l4,l5,l6;
	protected TextField t1,t2;
	protected CheckboxGroup cbg1;
	protected Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
	protected List l;
	protected Choice c;
	protected Button b1,b2;
	
	
	
	public MyFrame19(String n) {
		super(n);
		setBounds(200,100,1000,800);
		setBackground(Color.GRAY);
		
		MyActionListener4 m=new MyActionListener4(this);
		l1=new Label();
		l2=new Label();
		l3=new Label();
		l4=new Label();
		l5=new Label();
		l6=new Label();
		
		t1=new TextField();
		t2=new TextField();
		
		l1.setText("Name");
		l2.setText("Age");
		l3.setText("Gender");
		l4.setText("Qualification");
		l5.setText("City");
		l6.setText("State");
		
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l2.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l3.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l4.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l5.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l6.setFont(new Font(Font.DIALOG,Font.BOLD,30));

		
		l1.setBounds(100,50,250,50);
		l2.setBounds(100,150,250,50);
		l3.setBounds(100,250,250,50);
		l4.setBounds(100,350,250,50);
		l5.setBounds(100,450,250,50);
		l6.setBounds(100,550,250,50);
		
		t1.setBounds(400,50,350,50);
		t2.setBounds(400,150,350,50);
		
		b1=new Button("GET");
		b1.setBounds(350,650,100,50);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.BLACK);
		b1.addActionListener(m);
		
		b2=new Button("SET");
		b2.setBounds(550,650,100,50);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.BLACK);
		b2.addActionListener(m);
		
		cbg1=new CheckboxGroup();
		cb1=new Checkbox("M",cbg1,true);
		cb2=new Checkbox("F",cbg1,true);
		cb3=new Checkbox("TG",cbg1,true);
		
		cb1.setBounds(400,250,50,50);
		cb2.setBounds(500,250,50,50);
		cb3.setBounds(600,250,50,50);
		
		cb4=new Checkbox("UG");
		cb5=new Checkbox("PG");
		cb6=new Checkbox("PhD");
		cb7=new Checkbox("Dip");
		
		cb4.setBounds(400,350,50,50);
		cb5.setBounds(475,350,50,50);
		cb6.setBounds(550,350,90,50);
		cb7.setBounds(650,350,90,50);
		
		l=new List();
		l.setBounds(400,450,350,50);
		l.add("Trichy");
		l.add("Chennai");
		l.add("Banglore");
		l.add("Vizag");
		l.add("Hyderabad");
		
		
		c=new Choice();
		c.setBounds(400,550,350,50);
		c.add("Tamilnadu");
		c.add("Karnataka");
		c.add("Andra Pradesh");
		c.add("Telangana");
		
		
		
		
		setLayout(null);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(c);
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		add(cb7);
		
		setVisible(true);
	}

}
