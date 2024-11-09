package myFrame24;

import java.awt.*;
import java.awt.event.MouseListener;

public class MyFrame24 extends Frame{
	
	protected Graphics g;
	protected int a[]=new int[2];
	protected MyMouse m;
	
	public MyFrame24(String n) {
		super(n);
		
		setBounds(100,100,400,600);
		setBackground(Color.gray);
		
		m=new MyMouse(this);
		
		addMouseMotionListener(m);
		
		setLayout(null);
		setVisible(true);
	}
	
	public void dragLine() {
		g=getGraphics();
		g.setColor(Color.RED);
		g.drawLine(0,0,a[0], a[1]);
		
	}
	public void moveLine() {
		g=getGraphics();
		g.setColor(Color.GREEN);
		g.drawLine(0,0,a[0], a[1]);
		
	}
	
	public void paint(Graphics g) {
		g=getGraphics();
		
		g.setColor(Color.RED);
		g.drawLine(0,0,a[0], a[1]);
		
		
	}
}
