package myFrame14;

import java.awt.event.*;



import java.awt.*; 

public class MyActionListener implements ActionListener {
	private MyFrame14 f;
	private String exp="";
	private String opernd="";
	private String operndValue="";
	private String opr="";
	private String oldOpr;
	
	public MyActionListener(MyFrame14 f14) {
		f=f14;
	}
	
	public void actionPerformed(ActionEvent e) {
		String oprClick=e.getActionCommand();
		
		
		switch(oprClick) {
		case "1":
			exp+="1";
			opernd+="1";
			f.l1.setText(exp);
			break;
			
		case "2":
			exp+="2";
			opernd+="2";
			f.l1.setText(exp);
			break;
		case "3":
			exp+="3";
			opernd+="3";
			f.l1.setText(exp);
			break;
		case "4":
			exp+="4";
			opernd+="4";
			f.l1.setText(exp);
			break;
		case "5":
			exp+="5";
			opernd+="5";
			f.l1.setText(exp);
			break;
		case "6":
			exp+="6";
			opernd+="6";
			f.l1.setText(exp);
			break;
		case "7":
			exp+="7";
			opernd+="7";
			f.l1.setText(exp);
			break;
		case "8":
			exp+="8";
			opernd+="8";
			f.l1.setText(exp);
			break;
		case "9":
			exp+="9";
			opernd+="9";
			f.l1.setText(exp);
			break;
		case ".":
			exp+=".";
			opernd+=".";
			f.l1.setText(exp);
			break;
		case "0":
			exp+="0";
			opernd+="0";
			f.l1.setText(exp);
			break;
		case "+":
			exp+="+";
			if(opr.equals("")) {
				opr+="+";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="+";
				int a=Integer.valueOf(operndValue);
				int b=Integer.valueOf(opernd);
				switch (oldOpr) {
				case "+":
					int s=a+b;
					String sum=Integer.toString(s);
					operndValue=sum;
					opernd="";
					f.l1.setText(exp);
					break;
				
				case "-":
					int su=a-b;
					String sub=Integer.toString(su);
					operndValue=sub;
					opernd="";
					f.l1.setText(exp);
					break;
				case "*":
					int m=a*b;
					String mul=Integer.toString(m);
					operndValue=mul;
					opernd="";
					f.l1.setText(exp);
					break;
				case "/":
					int d=a/b;
					String div=Integer.toString(d);
					operndValue=div;
					opernd="";
					f.l1.setText(exp);
					break;
					
				}	
			}
			break;
		case "-":
			exp+="-";
			if(opr.equals("")) {
				opr+="-";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="-";
				int a=Integer.valueOf(operndValue);
				int b=Integer.valueOf(opernd);
				switch (oldOpr) {
				case "+":
					int s=a+b;
					String sum=Integer.toString(s);
					operndValue=sum;
					opernd="";
					f.l1.setText(exp);
					break;
				
				case "-":
					int su=a-b;
					String sub=Integer.toString(su);
					operndValue=sub;
					opernd="";
					f.l1.setText(exp);
					break;
				case "*":
					int m=a*b;
					String mul=Integer.toString(m);
					operndValue=mul;
					opernd="";
					f.l1.setText(exp);
					break;
				case "/":
					int d=a/b;
					String div=Integer.toString(d);
					operndValue=div;
					opernd="";
					f.l1.setText(exp);
					break;
					
				}	
			}
			break;
		case "*":
			exp+="*";
			if(opr.equals("")) {
				opr+="*";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="*";
				int a=Integer.valueOf(operndValue);
				int b=Integer.valueOf(opernd);
				switch (oldOpr) {
				case "+":
					int s=a+b;
					String sum=Integer.toString(s);
					operndValue=sum;
					opernd="";
					f.l1.setText(exp);
					break;
				
				case "-":
					int su=a-b;
					String sub=Integer.toString(su);
					operndValue=sub;
					opernd="";
					f.l1.setText(exp);
					break;
				case "*":
					int m=a*b;
					String mul=Integer.toString(m);
					operndValue=mul;
					opernd="";
					f.l1.setText(exp);
					break;
				case "/":
					int d=a/b;
					String div=Integer.toString(d);
					operndValue=div;
					opernd="";
					f.l1.setText(exp);
					break;
					
				}	
			}
			break;
		case "/":
			exp+="/";
			if(opr.equals("")) {
				opr+="/";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="/";
				int a=Integer.valueOf(operndValue);
				int b=Integer.valueOf(opernd);
				switch (oldOpr) {
				case "+":
					int s=a+b;
					String sum=Integer.toString(s);
					operndValue=sum;
					opernd="";
					f.l1.setText(exp);
					break;
				
				case "-":
					int su=a-b;
					String sub=Integer.toString(su);
					operndValue=sub;
					opernd="";
					f.l1.setText(exp);
					break;
				case "*":
					int m=a*b;
					String mul=Integer.toString(m);
					operndValue=mul;
					opernd="";
					f.l1.setText(exp);
					break;
				case "/":
					int d=a/b;
					String div=Integer.toString(d);
					operndValue=div;
					opernd="";
					f.l1.setText(exp);
					break;
					
				}	
			}
			break;
		case "=":
			exp+="=";
			int a=Integer.valueOf(operndValue);
			int b=Integer.valueOf(opernd);
			
			switch (opr) {
			case "+":
				int s=a+b;
				String sum=Integer.toString(s);
				exp+=sum;
				f.l1.setText(exp);
				break;
			case "-":
				int su=a-b;
				String sub=Integer.toString(su);
				exp+=sub;
				f.l1.setText(exp);
				break;
			case "*":
				int m=a*b;
				String mul=Integer.toString(m);
				exp+=mul;
				f.l1.setText(exp);
				break;
			case "/":
				int d=a/b;
				String div=Integer.toString(d);
				exp+=div;
				f.l1.setText(exp);
				break;
			
			}
			break;
		
		case "Clear":
			
			exp="";
			f.l1.setText(exp);
			operndValue="";
			opr="";
			opernd="";
			
			break;
		
		}
		
		
	}
}
