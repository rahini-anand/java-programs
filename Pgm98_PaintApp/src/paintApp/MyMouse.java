package paintApp;

import java.awt.*;
import java.awt.event.*;

public class MyMouse extends MouseAdapter implements MouseMotionListener{

	private MyPaintFrame f;
	protected int x1,y1,x2,y2,w,h,sx1,sx2,sy1,sy2;
	
	public MyMouse(MyPaintFrame mpf) {
		f=mpf;
	}
	
	public void mouseClicked(MouseEvent e) {
		  
		x1=e.getX();
		y1=e.getY();
		sx1=e.getX();
		sy1=e.getY();
	}
	public void mouseDragged(MouseEvent e) {
		 x2=e.getX();
		 y2=e.getY();
		 
		 sx2=e.getX();
		 sy2=e.getY();
		 
		 w=x2-x1;
		 h=y2-y1;
		 
		 f.pattern();
		 
		 sx1=e.getX();
		 sy1=e.getY();
	}
	public void mousePressed(MouseEvent e) {
		sx1=e.getX();
		sy1=e.getY();
	}
	
}
