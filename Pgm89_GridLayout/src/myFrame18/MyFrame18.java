package myFrame18;

import java.awt.*;

public class MyFrame18 extends Frame {
	
	private Panel p1,p2;
	private GridLayout l1,l2;
	
	private Button bno[];
	
	private String opst[];
	private Button bop[];
	
	
	public MyFrame18(String n) {
		super(n);
		
		setBackground(Color.BLACK);
		setBounds(200,200,600,550);
		
		p1=new Panel();
		p1.setBounds(100,100,400,4000);
		p1.setBackground(Color.GRAY);
		
		bno=new Button[10];
		
		for(int i=0;i<10;i++) {
			bno[i]=new Button(Integer.toString(i));
			p1.add(bno[i]);
			bno[i].setBackground(Color.BLACK);
			bno[i].setForeground(Color.BLACK);
		}
		
		opst=new String[] {"+","-","*","/","=","Clear"};
		
		bop=new Button[6];
		
		for (int i=0;i<6;i++) {
			bop[i]=new Button(opst[i]);
			p1.add(bop[i]);
			bop[i].setBackground(Color.BLACK);
			bop[i].setForeground(Color.BLACK);
		}
		
		l1=new GridLayout(4,4);
		p1.setLayout(l1);
		add(p1);
		setVisible(true);
		
	}
}
