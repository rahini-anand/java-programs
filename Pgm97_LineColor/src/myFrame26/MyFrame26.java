package myFrame26;

import java.awt.*;

public class MyFrame26 extends Frame {
	
	protected Panel p1,p2,p3;
	protected CheckboxGroup cbg1,cbg2;
	protected Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
	
	protected Graphics g;
	protected MyMouse m;
	
	public MyFrame26(String n) {
		super(n);
		setBounds(100,100,600,700);
		setBackground(Color.gray);
		
		p1=new Panel();
		p1.setBackground(Color.WHITE);
		p2=new Panel();
		p2.setBackground(Color.darkGray);
		p3=new Panel();
		p3.setBackground(Color.darkGray);
		
		p1.setBounds(50,50,350,600);
		p2.setBounds(450,50,50,200);
		p3.setBounds(450,300,50,200);
		m=new MyMouse(this);
		p1.addMouseMotionListener(m);
		p1.addMouseListener(m);
		
		cbg1=new CheckboxGroup();
		cbg2=new CheckboxGroup();
		
		cb1=new Checkbox("R",cbg1,true);
		cb2=new Checkbox("B",cbg1,true);
		cb3=new Checkbox("G",cbg1,true);
		cb4=new Checkbox("Y",cbg1,true);
		
		cb5=new Checkbox("2",cbg2,true);
		cb6=new Checkbox("5",cbg2,true);
		cb7=new Checkbox("10",cbg2,true);
		
		setLayout(null);
		
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		p2.add(cb4);
		
		p3.add(cb5);
		p3.add(cb6);
		p3.add(cb7);
		
		add(p1);
		add(p2);
		add(p3);
		setVisible(true);
	}
	
	public void line() {
		
		Checkbox cbc=cbg1.getSelectedCheckbox();
		String lc=cbc.getLabel();
		g=p1.getGraphics();
		
		
		Checkbox cbw=cbg2.getSelectedCheckbox();
		String lw=cbw.getLabel();
		
		
		Graphics2D g2d= (Graphics2D) g;
		g2d.setStroke(new BasicStroke(Integer.valueOf(lw)));
		
		
		switch(lc) {
		case "R":
			g.setColor(Color.RED);
			g.drawLine(m.x1,m.y1,m.x2,m.y2);
			break;
		case "B":
			g.setColor(Color.BLUE);
			g.drawLine(m.x1,m.y1,m.x2,m.y2);
			break;
		case "G":
			g.setColor(Color.GREEN);
			g.drawLine(m.x1,m.y1,m.x2,m.y2);
			break;
		case "Y":
			g.setColor(Color.YELLOW);
			g.drawLine(m.x1,m.y1,m.x2,m.y2);
			break;
		default:
			break;
		}
	}
	

}
