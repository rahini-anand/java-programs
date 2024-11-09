package myWindowListener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener{

	private MyFrame2 f;

	public MyWindowListener(MyFrame2 myFrame2) {
		f=myFrame2;
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Window Closing");
		f.dispose();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
		
	}

}
