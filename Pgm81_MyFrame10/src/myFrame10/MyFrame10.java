package myFrame10;

import java.awt.*;
import java.awt.event.*;

public class MyFrame10 extends Frame {

	private Label l1,l2;
	private TextField t1,t2;
	private Button b1,b2;
	
	
	private String [] a=new String [] {"Rahini","Kavin","Nivin","Anand",
			"Joshika","Shakthi","Arudh","Thulasi","Priya","Raju"};
	
	private String [] b=new String [] {"rahini","kavin","nivin","anand",
			"joshika","shakthi","arudh","thulasi","priya","raju"};
	
	
	public MyFrame10(String n) {
		super(n);
		setBackground(Color.black);
		setBounds(400,300,700,400);
		l1=new Label();
		l2=new Label();
		b1=new Button("OK");
		b2=new Button("Incorrect Credentials");
		t1=new TextField();
		t2=new TextField();
		
		l1.setText("Name:");
		l2.setText("Password:");
		l1.setBounds(50,120,250,50);
		l2.setBounds(50,180,250,50);
		t1.setBounds(350,120,250,50);
		t2.setBounds(350,180,250,50);
		t2.setEchoChar('*');
		b1.setBounds(250,300,70,50);
		b2.setBounds(50,50,250,50);
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		l2.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		setLayout(null);
		b1.setBackground(Color.green);
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (String n:a) {
						if(t1.getText().equals(n)) {
							for (String m:b) {
								if(t2.getText().equals(m)) {
									dispose();
								}
								else {
									add(b2);
								}
							}
						}
						else {
							add(b2);
						}
					}
					
					
				}
	});
		
		add(l1);
		add(l2);
		add(b1);
		add(t1);
		add(t2);
		setVisible(true);
	}
}
