package scientificCalculator;

import java.awt.*;


public class MyFrame15 extends Frame {
	protected Label l1;
	protected Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,
	b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35;
	
	public MyFrame15(String n) {
		super(n);
		MyActionListener2 m=new MyActionListener2(this);
		setBackground(Color.GRAY);
		setBounds(400,0,550,750);
		l1=new Label();
		
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		b11=new Button(".");
		b12=new Button("=");
		b13=new Button("+");
		b14=new Button("-");
		b15=new Button("*");
		b16=new Button("/");
		b17=new Button("Backspace");
		b18=new Button("Clear");
		b19=new Button("ON/OFF");
		b20=new Button("Pi");
		b21=new Button("Sqrt");
		b22=new Button("e**x");
		b23=new Button("ln");
		b24=new Button("log");
		b25=new Button("tan");
		b26=new Button("cos");
		b27=new Button("sin");
		b28=new Button("Cbrt");
		b29=new Button("Square");
		b30=new Button("cube");
		b31=new Button("**");
		b32=new Button("(");
		b33=new Button(")");
		b34=new Button("inverse(x)");
		b35=new Button("e");
		
		
		l1.setBounds(50,40,450,70);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.WHITE);
		
		//line 1
		b17.setBounds(50,160,100,35);
		b18.setBounds(235,160,100,35);
		b19.setBounds(420,160,100,35);
		
		//line2
		b20.setBounds(50,220,100,35);
		b21.setBounds(175,220,100,35);
		b22.setBounds(300,220,100,35);
		b23.setBounds(425,220,100,35);
		
		//line3
		b24.setBounds(50,280,100,35);
		b25.setBounds(175,280,100,35);
		b26.setBounds(300,280,100,35);
		b27.setBounds(425,280,100,35);
		
		//line4
		b28.setBounds(50,340,100,35);
		b29.setBounds(175,340,100,35);
		b30.setBounds(300,340,100,35);
		b31.setBounds(425,340,100,35);
		
		//line5
		b32.setBounds(50,400,100,35);
		b33.setBounds(175,400,100,35);
		b34.setBounds(300,400,100,35);
		b35.setBounds(425,400,100,35);
				
		
		//line6
		b7.setBounds(50,480,100,35);
		b8.setBounds(175,480,100,35);
		b9.setBounds(300,480,100,35); 
		b13.setBounds(425,480,100,35);
		
		//line7
		b4.setBounds(50,540,100,35);
		b5.setBounds(175,540,100,35);
		b6.setBounds(300,540,100,35);
		b14.setBounds(425,540,100,35);
		
		//line 8
		b1.setBounds(50,600,100,35);
		b2.setBounds(175,600,100,35);
		b3.setBounds(300,600,100,35);
		b15.setBounds(425,600,100,35);
		
		//line9
		b10.setBounds(50,660,100,35);
		b11.setBounds(175,660,100,35);
		b12.setBounds(300,660,100,35);
		b16.setBounds(425,660,100,35);
		
		l1.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		
		
		
		setLayout(null);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b3.setBackground(Color.black);
		b4.setBackground(Color.black);
		b5.setBackground(Color.black);
		b6.setBackground(Color.black);
		b7.setBackground(Color.black);
		b8.setBackground(Color.black);
		b9.setBackground(Color.black);
		b10.setBackground(Color.black);
		b11.setBackground(Color.black);
		b12.setBackground(Color.black);
		b13.setBackground(Color.black);
		b14.setBackground(Color.black);
		b15.setBackground(Color.black);
		b16.setBackground(Color.black);
		b17.setBackground(Color.black);
		b18.setBackground(Color.black);
		b19.setBackground(Color.black);
		b20.setBackground(Color.black);
		b21.setBackground(Color.black);
		b22.setBackground(Color.black);
		b23.setBackground(Color.black);
		b24.setBackground(Color.black);
		b25.setBackground(Color.black);
		b26.setBackground(Color.black);
		b27.setBackground(Color.black);
		b28.setBackground(Color.black);
		b29.setBackground(Color.black);
		b30.setBackground(Color.black);
		b31.setBackground(Color.black);
		b32.setBackground(Color.black);
		b33.setBackground(Color.black);
		b34.setBackground(Color.black);
		b35.setBackground(Color.black);
		
		b1.addActionListener(m); 		
		b2.addActionListener(m);
		b3.addActionListener(m);
		b4.addActionListener(m);
		b5.addActionListener(m); 		
		b6.addActionListener(m);
		b7.addActionListener(m);
		b8.addActionListener(m);
		b9.addActionListener(m); 		
		b10.addActionListener(m);
		b11.addActionListener(m);
		b12.addActionListener(m);
		b13.addActionListener(m); 		
		b14.addActionListener(m);
		b15.addActionListener(m);
		b16.addActionListener(m);
		b17.addActionListener(m);
		b18.addActionListener(m);
		b19.addActionListener(m); 		
		b20.addActionListener(m);
		b21.addActionListener(m);
		b22.addActionListener(m);
		b23.addActionListener(m); 		
		b24.addActionListener(m);
		b25.addActionListener(m);
		b26.addActionListener(m);
		b27.addActionListener(m);
		b28.addActionListener(m);
		b29.addActionListener(m); 		
		b30.addActionListener(m);
		b31.addActionListener(m);
		b32.addActionListener(m);
		b33.addActionListener(m); 		
		b34.addActionListener(m);
		b35.addActionListener(m);
		
		
		add(l1);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		add(b25);
		add(b26);
		add(b27);
		add(b28);
		add(b29);
		add(b30);
		add(b31);
		add(b32);
		add(b33);
		add(b34);
		add(b35);
		
		
		setVisible(true);
	}
}
