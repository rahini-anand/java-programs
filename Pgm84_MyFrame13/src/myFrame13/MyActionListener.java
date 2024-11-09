package myFrame13;

import java.awt.event.*;
import java.awt.*;

public class MyActionListener implements ActionListener {
	
	private MyFrame13 f;
	
	public MyActionListener(MyFrame13 f13) {
		f=f13;
	}
	
	public void actionPerformed(ActionEvent e) {
		String opr=e.getActionCommand();
		
		int a=Integer.valueOf(f.t1.getText());
		int b=Integer.valueOf(f.t2.getText());
		
		switch (opr) {
		case "+":
			int s=a+b;
			String m=Integer.toString(s);
			f.l4.setText(m);
			break;
		
		case "-":
			int s1=a-b;
			String m1=Integer.toString(s1);
			f.l4.setText(m1);

			break;
			
		case "*":
			int s2=a*b;
			String m2=Integer.toString(s2);
			f.l4.setText(m2);
			break;
			
		case "/":
			int s3=a/b;
			String m3=Integer.toString(s3);
			f.l4.setText(m3);

			break;
			
		}
		
			}

}
