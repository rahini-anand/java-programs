package myFram1;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame1 extends Frame implements WindowListener{
	
	public MyFrame1(String n) {
		super(n);
		setBackground(Color.blue);
		setBounds(300,200,500,300);
		addWindowListener(this);
		setVisible(true);
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
	}

	public void windowClosing(WindowEvent e) {
		dispose();
		System.out.println("Window closing");
		
	}

	
	public void windowClosed(WindowEvent e) {
		System.out.println("Window closed");
		
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
