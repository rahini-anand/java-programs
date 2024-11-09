package myFrame21;

import java.awt.*;
import java.awt.event.*;

public class MyActionListener implements ActionListener{
	
	protected MyFrame21 f;
	protected String click="";
	
	public MyActionListener(MyFrame21 f21) {
		f=f21;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		click=e.getActionCommand();
		
		
		switch (click) {
		case "Text":
			f.text();
			break;
		case "Line":
			f.line();
			break;
		case "Rectangle":
			f.rectangle();
			break;
		case "Oval":
			f.oval();
			break;
		case "Arc":
			f.arc();
			break;
		default:
			break;
		}
		
	}
	

}
