package myFrame19;

import java.awt.*;

import java.awt.event.*;

public class MyActionListener4 implements ActionListener{
	
	protected MyFrame19 f;
	private String t3,t4,t5,t10,t11,q;
	private boolean t6,t7,t8,t9;
	private Checkbox cb;
	
	public MyActionListener4(MyFrame19 f19) {
		f=f19;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String click=e.getActionCommand();
		
		if(click.equals("GET")) {
		
			 Get();
		}
		else if(click.equals("SET")) {
			Set();
		}
	}
	
	public void Get() {
		t3=f.t1.getText();
		t4=f.t2.getText();
	
		cb=f.cbg1.getSelectedCheckbox();
		t5=cb.getLabel();
	
		boolean t6=f.cb4.getState();
		boolean t7=f.cb5.getState();
		boolean t8=f.cb6.getState();
		boolean t9=f.cb7.getState();
	
		q="";
	
		if(t6) {
			q+=f.cb4.getLabel();
			q+=',';
		}
		if(t7) {
			q+=f.cb5.getLabel();
			q+=',';
		}
		if(t8) {
			q+=f.cb6.getLabel();
			q+=',';
		}
		if(t9) {
			q+=f.cb7.getLabel();
			q+=',';
		}
	
		t10=f.l.getSelectedItem();
		t11=f.c.getSelectedItem();
	

	
		System.out.println("Name:"+t3);
		System.out.println("Age:"+t4);
		System.out.println("Gender:"+t5);
		System.out.println("Qualification:"+q);
		System.out.println("City:"+t10);
		System.out.println("State:"+t11);
	
	}
	
	public void Set() {
		f.t1.setText("Anand D");
		f.t2.setText("37");
		f.cbg1.setSelectedCheckbox(f.cb1);
		f.cb4.setState(false);
		f.cb5.setState(true);
		f.cb6.setState(false);
		f.cb7.setState(false);
		f.l.setName("Trichy");
		f.c.setName("TamilNadu");
	
		
	}

}
