package myFrame22;

import java.awt.event.*;

public class MyMouse implements MouseListener{
	
	protected MyFrame22 f;
	
	public MyMouse(MyFrame22 f22) {
		f=f22;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");
		
	}
	
	

}
