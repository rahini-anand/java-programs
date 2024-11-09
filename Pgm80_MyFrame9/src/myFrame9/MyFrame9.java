package myFrame9;
import java.awt.*;

import java.awt.event.*;


public class MyFrame9 extends Frame {
	
	private Label l1,l2;
	private TextField t1,t2;
	private Button b1;
	
	public MyFrame9(String n) {
		super(n);
		setBackground(Color.black);
		setBounds(400,300,700,400);
		l1=new Label();
		l2=new Label();
		b1=new Button("OK");
		t1=new TextField();
		t2=new TextField();
		
		l1.setText("Name:");
		l2.setText("Password:");
		l1.setBounds(50,50,250,70);
		l2.setBounds(50,180,250,70);
		t1.setBounds(350,50,250,70);
		t2.setBounds(350,180,250,70);
		t2.setEchoChar('*');
		b1.setBounds(250,300,70,50);
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		l2.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		setLayout(null);
		b1.setBackground(Color.green);
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if((t1.getText().equals("Rahini")) &&(t2.getText().equals("qwerty"))){
						dispose();
					}
					else {
						System.out.println("Invalid Name and/or Password");
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
