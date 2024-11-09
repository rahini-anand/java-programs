package myFrame26;


import java.awt.event.*;

public class MyMouse extends MouseAdapter implements MouseMotionListener {
	
	private MyFrame26 f;
	protected int x1,y1,x2,y2;
	
	public MyMouse(MyFrame26 f26) {
		f=f26;
	}
	
	public void mouseClicked(MouseEvent e) {
		
		  x1=e.getX();
		  y1=e.getY();
		  System.out.println(x1+","+y1);
			
	}
	public void mouseDragged(MouseEvent e) {
		 x2=e.getX();
		 y2=e.getY();
		 //System.out.println(x2+","+y2);
		//f.line();
		
		x1=e.getX();
		y1=e.getY();
		//System.out.println(x1+","+y1);
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	

}
