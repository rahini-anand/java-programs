package myWindowAdapter;
import java.awt.*;
import java.awt.event.*;



public class MyWindowAdapter extends WindowAdapter {
	
	private MyFrame3 f;
	
	public MyWindowAdapter(MyFrame3 m) {
		f=m;
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
		System.out.println("Window Closing");
	}
	

}
