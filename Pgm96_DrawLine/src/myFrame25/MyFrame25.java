package myFrame25;

import java.awt.*;



public class MyFrame25 extends Frame {
	protected Graphics g;
	protected int a[]=new int[4];
	protected MyMouse m;
	
	public MyFrame25(String n) {
		super(n);
		
		setBounds(100,100,400,600);
		setBackground(Color.gray);
		
		m=new MyMouse(this);
		
		addMouseListener(m);
		addMouseMotionListener(m);
		
		setLayout(null);
		setVisible(true);
	}
	
	public void line() {
		g=getGraphics();
		g.setColor(Color.RED);
		g.drawLine(a[0],a[1],a[2],a[3]);
		
	}
	
	public void paint(Graphics g) {
		g=getGraphics();
		
		g.setColor(Color.RED);
		g.drawLine(a[0],a[1],a[2],a[3]);
		
		
	}
}
