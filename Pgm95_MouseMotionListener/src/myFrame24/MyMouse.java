package myFrame24;

import java.awt.event.*;

public class MyMouse implements MouseMotionListener {
	protected MyFrame24 f;
	
	public MyMouse(MyFrame24 f24) {
		f=f24;
	}
	
	public void mouseDragged(MouseEvent e) {
		f.a[0]=e.getX();
		f.a[1]=e.getY();
		
		f.dragLine();
	}
	public void mouseMoved(MouseEvent e) {
		f.a[0]=e.getX();
		f.a[1]=e.getY();
		
		f.moveLine();
	}
}
