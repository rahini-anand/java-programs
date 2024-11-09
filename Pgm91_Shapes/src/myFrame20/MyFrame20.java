package myFrame20;

import java.awt.*;

public class MyFrame20 extends Frame {
	
	protected Button b1;
	protected Graphics g;
	
	
	public MyFrame20(String n){
		super(n);
		setBounds(200,200,800,700);
		setBackground(Color.gray);
		setVisible(true);
	}
	public void text() {
		g=getGraphics();
		Font f1=new Font(Font.DIALOG,Font.BOLD,400);
		g.drawString("Kavin", 100, 400);
		g.setFont(f1);
		
	}
	public void line() {
		g=getGraphics();
		g.drawLine(300,200, 400, 200);
	}
	public void rectangle() {
		g=getGraphics();
		g.drawRect(400,400, 150, 100);
		g.fillRect(400,400, 150, 100);
	}
	public void oval() {
		g=getGraphics();
		g.drawOval(300,300, 200, 100);
		g.fillOval(300,300, 200, 100);
	}
	public void arc() {
		g=getGraphics();
		g.drawArc(300,600, 200, 100,30,60);
		g.fillArc(300,600, 200, 100,30,60);
	}
	
	public void paint(Graphics g) {
		
		text();
		line();
		rectangle();
		oval();
		arc();
	}
}
