package myFrame;

import java.awt.*;



public class MyFrame extends Frame {
	protected Button b1,b2,b3,b4,b5;
	protected Panel p1,p2,p3;
	protected CheckboxGroup cbg;
	protected Checkbox cb1,cb2,cb3,cb4;
	protected Graphics g;
	protected MyActionListener m;
	
	protected int a[]=new int[2];
	
	
	public MyFrame(String n){
		super(n);
		setBounds(200,200,800,700);
		setBackground(Color.gray);
		setLayout(null);
		
		p1=new Panel();
		p1.setBounds(500,200,200,550);
		p2=new Panel();
		p2.setBounds(50,50,450,100);
//		p3=new Panel();
//		p3.setBounds(50,200,400,400);
//		p3.setBackground(Color.white);
//		
		b1=new Button("Text");
		b2=new Button("Line");
		b3=new Button("Rectangle");
		b4=new Button("Oval");
		b5=new Button("Arc");
		
		b1.setBounds(10,200,180,50);
		b2.setBounds(10,300,180,50);
		b3.setBounds(10,400,180,50);
		b4.setBounds(10,500,180,50);
		b5.setBounds(10,600,180,50);
		
		m=new MyActionListener(this);
		
		b1.addActionListener(m);
		b2.addActionListener(m);
		b3.addActionListener(m);
		b4.addActionListener(m);
		b5.addActionListener(m);
		
		cbg=new CheckboxGroup();
		
		cb1=new Checkbox("R",cbg,true);
		cb2=new Checkbox("B",cbg,true);
		cb3=new Checkbox("G",cbg,true);
		cb4=new Checkbox("Y",cbg,true);
		
		cb1.setBounds(10,100,50,50);
		cb2.setBounds(110,100,50,50);
		cb3.setBounds(210,100,50,50);
		cb4.setBounds(310,100,50,50);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		p2.add(cb4);
		
		add(p1);
		add(p2);
		//add(p3);
		
		setVisible(true);
	}
	public void text() {
		g=getGraphics();
		Font f1=new Font(Font.DIALOG,Font.BOLD,400);
		g.drawString("Display", 200, 200);
		a[0]=200;
		a[1]=200;
		g.setFont(f1);
		g.setColor(Color.RED);
			
	}
	
	public void line() {
		g=getGraphics();
		g.setColor(Color.RED);
		g.drawLine(100, 100, 200,200);
		
	}
	public void paint(Graphics g) {
	
		g=getGraphics();
		Font f1=new Font(Font.DIALOG,Font.BOLD,400);
		g.drawString("Display", a[0], a[1]);
		g.setFont(f1);
		
		g.drawLine(100, 100, 200,200);
		g.setColor(Color.RED);
			
	}
	

}
