package myFrame25;

import java.awt.event.*;

public class MyMouse extends MouseAdapter implements MouseMotionListener {
	
	private MyFrame25 f;
	
	public MyMouse(MyFrame25 f25) {
		f=f25;	
	}
	
	
	
	public void mouseDragged(MouseEvent e) {
		f.a[0]=e.getX();
		f.a[1]=e.getY();
		
	}
	public void mouseMoved(MouseEvent e) {
		f.a[2]=e.getX();
		f.a[3]=e.getY();
		
		f.line();
		f.a[0]=e.getX();
		f.a[1]=e.getY();
	}
	

}
