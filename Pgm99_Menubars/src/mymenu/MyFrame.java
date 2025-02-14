package mymenu;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
	
	private MenuBar mb;
	private Menu mn;
	private MenuItem mi2,mi3,mi4,mi1;
	
	public MyFrame(String n) {
		super(n);
		setBounds(100,100,400,400);
		setBackground(Color.gray);
		
		mb=new MenuBar();
		
		mn=new Menu("Windows");
		
		mi1=new MenuItem("Maximize");
		mi2=new MenuItem("Minimize");
		mi3=new MenuItem("Restore");
		mi4=new MenuItem("Close");
		
		
		mn.add(mi1);
		mn.add(mi2);
		mn.add(mi3);
		mn.add(mi4);
		
		mb.add(mn);
		
		setLayout(null);
		
		mi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
			}
		});
		
		mi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.NORMAL);
			}
		});
		
		mi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(java.awt.Frame.ICONIFIED);
			}
		});
		
		mi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		setMenuBar(mb);
		setVisible(true);
		
	}

}
