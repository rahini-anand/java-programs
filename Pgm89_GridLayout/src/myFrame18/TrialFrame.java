package myFrame18;

import java.awt.*;

public class TrialFrame extends Frame {
	
	private Panel p1;
	private Button bno[],bop[],bfn[];
	private String opst[],fnst[];
	private GridLayout l1,l2,l3;
	
	public TrialFrame(String n) {

		super(n);
		setBounds(200,100,600,800);
		
		
		p1=new Panel();
		
		p1.setBounds(100,100,500,700);
		
		
		l1=new GridLayout(4,9);
		
		
		p1.setLayout(l1);
		
		bno=new Button[10];
		
		for (int i=0;i<10;i++) {
			bno[i]=new Button(Integer.toString(i));
			p1.add(bno[i]);
			bno[i].setBackground(Color.BLACK);
			bno[i].setForeground(Color.BLACK);
		}
			
			
		bop=new Button[6];	
		
		 opst=new String[] {"+","-","*","/","=","Clear"};
		
		for (int i=0;i<6;i++) {
			bop[i]=new Button(opst[i]);
			p1.add(bop[i]);
			bop[i].setBackground(Color.BLACK);
			bop[i].setForeground(Color.BLACK);
		}	
		
		bfn=new Button[9];	
		
		 fnst=new String[] {"tan","cos","sin","cube","square","sqrt","cbrt","inverse","log"};
		
		for (int i=0;i<9;i++) {
			bfn[i]=new Button(fnst[i]);
			p1.add(bfn[i]);
			bfn[i].setBackground(Color.BLACK);
			bfn[i].setForeground(Color.BLACK);
		}	
		
		add(p1);
		
		setVisible(true);
	}
	
}
