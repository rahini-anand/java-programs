package myFrame11;

import java.awt.*;
import java.awt.event.*;

public class MyFrame11 extends Frame{
	
	private Label l1,l2,l3,l4;
	private TextField t1,t2;
	private Button b1;

	
	public MyFrame11(String n) {
		super(n);
		setBackground(Color.black);
		setBounds(400,300,700,600);
		l1=new Label();
		l2=new Label();
		l3=new Label();
		l4=new Label();
		b1=new Button("Add");
		t1=new TextField();
		t2=new TextField();
		
		l1.setText("A");
		l2.setText("B");
		l3.setText("Result");
		l1.setBounds(100,100,100,50);
		l2.setBounds(100,200,100,50);
		l3.setBounds(100,300,100,50);
		l4.setBounds(400,300,100,50);
		t1.setBounds(400,100,250,50);
		t2.setBounds(400,200,250,50);
		b1.setBounds(250,500,100,50);
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l2.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l3.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		l4.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		setLayout(null);
		b1.setBackground(Color.green);
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String as=t1.getText();
					String bs=t2.getText();
					int a=Integer.valueOf(as);
					int b=Integer.valueOf(bs);
					
					int s=a+b;
					String sum=Integer.toString(s);			
					l4.setText(sum);
				}
	});
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b1);
		add(t1);
		add(t2);
		setVisible(true);
	} 

}
