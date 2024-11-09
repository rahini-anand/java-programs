package myFrame23;

import java.awt.event.*;

public class MyMouse extends MouseAdapter{
	
	protected MyFrame23 f;
	
	public MyMouse(MyFrame23 f23) {
		f=f23;
	}
	
	public void mouseClicked(MouseEvent e) {
	
		f.mouseClick();
	}

}
