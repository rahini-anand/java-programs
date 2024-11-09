package myFrame;

import java.awt.event.*;



public class MyActionListener implements ActionListener{
	protected MyFrame f;
	protected String click="";
	
	
	public MyActionListener(MyFrame f21) {
		f=f21;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		click=e.getActionCommand();
		
		
		if(click.equals("Text")) {
			f.text();
		}
		else if(click.equals("Line")) {
			f.line();
		}
		
	}

}
