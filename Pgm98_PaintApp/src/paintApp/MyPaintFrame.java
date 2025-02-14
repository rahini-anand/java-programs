package paintApp;

import java.awt.*;

public class MyPaintFrame extends Frame {	
	
	protected Panel p1,p2,p3,p4;
	protected Button b1,b2,b3,b4;
	protected CheckboxGroup cbg1,cbg2,cbg3;
	protected Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
	
	protected Graphics g;
	protected MyMouse m;
	
	public MyPaintFrame(String n) {
		super(n);
		setBounds(100,100,600,700);
		setBackground(Color.gray);
		
		p1=new Panel();
		p1.setBackground(Color.WHITE);
		p2=new Panel();
		p2.setBackground(Color.darkGray);
		p3=new Panel();
		p3.setBackground(Color.darkGray);
		p4=new Panel();
		p4.setBackground(Color.darkGray);
		
		p1.setBounds(50,50,350,600);
		p2.setBounds(450,50,100,150);
		p3.setBounds(450,200,100,150);
		p4.setBounds(450,350,100,275);
			
		m=new MyMouse(this);
		p1.addMouseMotionListener(m);
		p1.addMouseListener(m);
		
		
		cbg1=new CheckboxGroup();
		cbg2=new CheckboxGroup();
		cbg3=new CheckboxGroup();
		
		cb1=new Checkbox("R",cbg1,true);
		cb2=new Checkbox("B",cbg1,true);
		cb3=new Checkbox("G",cbg1,true);
		
		
		cb4=new Checkbox("2",cbg2,true);
		cb5=new Checkbox("5",cbg2,true);
		cb6=new Checkbox("10",cbg2,true);
		
		cb7=new Checkbox("Line",cbg3,true);
		cb8=new Checkbox("Rect",cbg3,true);
		cb9=new Checkbox("Oval",cbg3,true);
		cb10=new Checkbox("Sketch",cbg3,true);
		setLayout(null);
		
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		
		p3.add(cb4);
		p3.add(cb5);
		p3.add(cb6);
		
		p4.add(cb7);
		p4.add(cb8);
		p4.add(cb9);
		p4.add(cb10);
		
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setVisible(true);
		
	}
	
	public void pattern() {
		Checkbox cbc=cbg1.getSelectedCheckbox();
		String lc=cbc.getLabel();
		g=p1.getGraphics();
		
		
		Checkbox cbw=cbg2.getSelectedCheckbox();
		String lw=cbw.getLabel();
		
		Checkbox cbp=cbg3.getSelectedCheckbox();
		String pat=cbp.getLabel();
		
		Graphics2D g2d= (Graphics2D) g;
		g2d.setStroke(new BasicStroke(Integer.valueOf(lw)));
		
		
		switch(lc) {
		case "R":
			g.setColor(Color.RED);
			break;
		case "B":
			g.setColor(Color.BLUE);
			break;
		case "G":
			g.setColor(Color.GREEN);
			break;
		
		default:
			break;
		}	
		switch(pat) {
			case "Rect":
				g.drawRect(m.x1,m.y1,m.w,m.h);
				break;
			case "Line":
				g.drawLine(m.x1,m.y1,m.x2,m.y2);
				break;
			case "Oval":
				g.drawOval(m.x1,m.y1,m.w,m.h);
				break;
			case "Sketch":
				g.drawLine(m.sx1,m.sy1,m.sx2,m.sy2);
			
			default:
				break;
		}
		
	}
}
