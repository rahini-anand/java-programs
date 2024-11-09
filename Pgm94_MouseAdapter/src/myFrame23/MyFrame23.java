package myFrame23;

import java.awt.*;

public class MyFrame23 extends Frame {
	
	protected Graphics g;
	protected int a[]=new int[2];
	
	public MyFrame23(String n) {
		super(n);
		
		setBounds(100,100,400,600);
		setBackground(Color.gray);
		
		MyMouse m=new MyMouse(this);
		
		addMouseListener(m);
		
		setLayout(null);
		setVisible(true);
	}
	
	public void mouseClick() {
		g=getGraphics();
		g.drawString("Mouse Clicked", 100, 200);
		a[0]=100;
		a[1]=200;
		
		Font f1=new Font(Font.SERIF,Font.BOLD,60);
		g.setFont(f1);
	}
	
	public void paint(Graphics g) {
		g=getGraphics();
		g.drawString("Mouse Clicked", a[0], a[1]);
		Font f1=new Font(Font.SERIF,Font.BOLD,60);
		g.setFont(f1);
	}

}
