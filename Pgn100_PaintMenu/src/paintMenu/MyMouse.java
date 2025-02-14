package paintMenu;

import java.awt.*;
import java.awt.event.*;

public class MyMouse extends MouseAdapter implements ActionListener,MouseMotionListener {

	protected int x1,x2,y1,y2,w,h,sx1,sy1,sx2,sy2;
	private MyFrame f;
	protected String str,pat,clr,wid;
	
	
	public MyMouse(MyFrame fm) {
		f=fm;
	}
	public void actionPerformed(ActionEvent e) {
		str=e.getActionCommand();
		if (str.equals("Red")||(str.equals("Blue"))||(str.equals("Green"))||(str.equals("Yellow"))){
			clr=str;	
		}
		else if (str.equals("2")||(str.equals("5"))||(str.equals("7"))||(str.equals("10"))){
			wid=str;
			
		}
		else if (str.equals("Line")||(str.equals("Rectangle"))||(str.equals("Oval"))||(str.equals("Sketch"))){
			pat=str;
		}
		else if(str.equals("Redraw")) {
			f.redraw();
		}
	
	}
	
	public void mouseClicked(MouseEvent e) {
		x1=e.getX();
		y1=e.getY();
		
		sx1=e.getX();
		sy1=e.getY();
		f.i+=1;
	}
	
	public void mouseDragged(MouseEvent e) {
		x2=e.getX();
		y2=e.getY();
		
		sx2=e.getX();
		sy2=e.getY();
		
		w=x2-x1;
		h=y2-y1;
	
		f.pattern(pat,wid,clr);
		
		sx1=e.getX();
		sy1=e.getY();
	
	}
		
}
