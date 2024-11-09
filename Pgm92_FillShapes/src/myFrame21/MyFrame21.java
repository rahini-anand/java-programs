package myFrame21;

import java.awt.*;

public class MyFrame21 extends Frame {
	protected Button b1,b2,b3,b4,b5;
	protected Panel p1,p2,p3;
	protected CheckboxGroup cbg;
	protected Checkbox cb1,cb2,cb3,cb4;
	protected Graphics g;
	protected MyActionListener m;
	
	
	protected int line[]=new int[4];
	protected int text[]=new int[2];
	protected int rec[]=new int[4];
	protected int oval[]=new int[4];
	protected int arc[]=new int[6];
	
	
	public MyFrame21(String n){
		super(n);
		setBounds(200,200,800,700);
		setBackground(Color.gray);
		setLayout(null);
		
		p1=new Panel();
		p1.setBounds(500,200,200,550);
		p2=new Panel();
		p2.setBounds(50,50,450,100);
		//p3=new Panel();
		//p3.setBounds(50,200,400,400);
		//p3.setBackground(Color.green);
		
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
		text[0]=200;
		text[1]=200;
		g.setFont(f1);
		setColour();	
	}
	public void line() {
		
		g=getGraphics();
		g.drawLine(150,350, 350, 450);
		line[0]=150;
		line[1]=350;
		line[2]=350;
		line[3]=450;
		setColour();
	}
	public void rectangle() {
		g=getGraphics();
		g.drawRect(200,200, 150, 100);
		g.fillRect(200,200, 150, 100);
		rec[0]=200;
		rec[1]=200;
		rec[2]=150;
		rec[3]=100;
		setColour();
	}
	public void oval() {
		g=getGraphics();
		g.drawOval(250,350, 100, 70);
		g.fillOval(250,350, 100, 70);
		oval[0]=250;
		oval[1]=350;
		oval[2]=100;
		oval[3]=70;
		
		setColour();
	}
	public void arc() {
		g=getGraphics();
		g.drawArc(350,300, 100, 100,30,60);
		g.fillArc(350,300, 100, 100,30,60);
		arc[0]=350;
		arc[1]=300;
		arc[2]=100;
		arc[3]=100;
		arc[4]=30;
		arc[5]=60;
		
		setColour();
	}
	
	public void setColour() {
		
//		g=p3.getGraphics();
//		Checkbox cb=cbg.getSelectedCheckbox();
//		String l=cb.getLabel();
//		
//		switch (l){
//		case "R":
//			p3.setBackground(Color.red);
//			break;
//		case "B":
//			p3.setBackground(Color.blue);
//			break;
//		case "G":
//			p3.setBackground(Color.green);
//			break;
//		case "Y":
//			p3.setBackground(Color.yellow);
//			break;
//		default:
//			break;
//		}
		
	}
	
	public void paint(Graphics g) {
		
		g=getGraphics();
		
		Font f1=new Font(Font.DIALOG,Font.BOLD,400);
		g.drawString("Display", text[0], text[1]);
		g.setFont(f1);
		
		
		g.drawLine(line[0], line[1], line[2], line[3]);
		
		g.drawRect(rec[0],rec[1], rec[2], rec[3]);
		g.fillRect(rec[0],rec[1], rec[2], rec[3]);
		
		g.drawOval(oval[0],oval[1], oval[2], oval[3]);
		g.fillOval(oval[0],oval[1], oval[2], oval[3]);
		
		g.drawArc(arc[0],arc[1], arc[2],arc[3],arc[4],arc[5]);
		g.fillArc(arc[0],arc[1], arc[2],arc[3],arc[4],arc[5]);
			
	}

}
