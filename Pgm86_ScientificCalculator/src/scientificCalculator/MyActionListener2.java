package scientificCalculator;

import java.awt.*;
import java.awt.event.*;

public class MyActionListener2 implements ActionListener {
	
	private MyFrame15 f;
	private String exp="";
	private String opernd="";
	private String operndValue="";
	private String opr="";
	private String oldOpr="";
	private String tempOpr="";
	private String tempVal="";
	private String fnName="";
	
	public MyActionListener2(MyFrame15 f15) {
		f=f15;
	}
	
	public void actionPerformed(ActionEvent e) {
		String copr=e.getActionCommand();
		
		char c=copr.charAt(0);
	
		
		if((c>'0' && c<'9')||(c=='.')) {
			Opernd(copr);
		}
		

		else if(c=='+'||c=='-'||c=='*'||c=='/'||copr.equals("**")) {
				Operator(copr);
		}
		
		else if(copr.equals("log")||copr.equals("tan")||copr.equals("sin")||copr.equals("cos")||copr.equals("e**x")||copr.equals("sqrt")||copr.equals("square")||copr.equals("cube")||copr.equals("cbrt")||copr.equals("sqrt")||copr.equals("inverse(x)")) {
				fnName=copr;
				exp+=copr;
				exp+="(";
				f.l1.setText(exp);
				ClosingBracket(copr);
		
		}
		else if(copr.equals("(")) {
			OpeningBracket(copr);
		}
		else if(copr.equals(")")) {
			ClosingBracket(copr);
		}
		else if(copr.equals("=")) {
			Equals(copr);
		}
		
	}
	public void Opernd(String sopr) {
		exp+=sopr;
		opernd+=sopr;
		f.l1.setText(exp);	}
	
	public void Operation(String sopr,double a,double b) {
		switch (sopr) {
		case "+":
			double s=a+b;
			String sum=Double.toString(s);
			operndValue=sum;
			opernd="";
			f.l1.setText(exp);
			break;
		
		case "-":
			double su=a-b;
			String sub=Double.toString(su);
			operndValue=sub;
			opernd="";
			f.l1.setText(exp);
			break;
		case "*":
			double m=a*b;
			String mul=Double.toString(m);
			operndValue=mul;
			opernd="";
			f.l1.setText(exp);
			break;
		case "/":
			double d=a/b;
			String div=Double.toString(d);
			operndValue=div;
			opernd="";
			f.l1.setText(exp);
			break;
		default:
			break;
		}	
	}
	
	public void Operator(String sopr) {
		
		switch (sopr) {
		case "+":
			exp+="+";
			if(opr.equals("")) {
				opr="+";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="+";
				double a=Double.valueOf(operndValue);
				double b=Double.valueOf(opernd);
				Operation(oldOpr,a,b);
			}
			break;
			
		case "-":
			exp="-";
			if(opr.equals("")) {
				opr+="-";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="-";
				double a=Double.valueOf(operndValue);
				double b=Double.valueOf(opernd);
				Operation(oldOpr,a,b);
			}
			break;
			
		case "*":
			exp+="*";
			if(opr.equals("")) {
				opr="*";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="*";
				double a=Double.valueOf(operndValue);
				double b=Double.valueOf(opernd);
				Operation(oldOpr,a,b);
			}
			break;
			
		case "/":
			exp+="/";
			if(opr.equals("")) {
				opr="/";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="/";
				double a=Double.valueOf(operndValue);
				double b=Double.valueOf(opernd);
				Operation(oldOpr,a,b);
			}
			break;
		case "**":
			exp+="**";
			if(opr.equals("")) {
				opr="**";
				operndValue=opernd;
				opernd="";
				f.l1.setText(exp);
			}
			else {
				oldOpr=opr;
				opr="**";
				double a=Double.valueOf(operndValue);
				double b=Double.valueOf(opernd);
				double fnPower=Math.pow(a, b);
				operndValue=Double.toString(fnPower);
				
			}
			break;
			default:
				break;
		}
	}
	
	public void OpeningBracket(String sopr) {
		exp+=sopr;
		f.l1.setText(exp);
		tempVal=operndValue;
		tempOpr=opr;
		operndValue="";
		opr="";
	}
	public void ClosingBracket(String sopr) {
		exp+=")";
		f.l1.setText(exp);
		
		if(tempOpr.equals("")) {
			if(fnName.equals("sin")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=(Math.sin(fnOpernd));
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("cos")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=(Math.cos(fnOpernd));
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("tan")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=(Math.tan(fnOpernd));
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("Sqrt")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=(Math.sqrt(fnOpernd));
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("cbrt")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=(Math.cbrt(fnOpernd));
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("sqr")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=fnOpernd*fnOpernd;
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("cub")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=fnOpernd*fnOpernd*fnOpernd;
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("e**")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=Math.exp(fnOpernd);
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("inv(x)")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=1.0/fnOpernd;
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("e")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=Math.E;
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("log(")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=Math.log(fnOpernd);
				opernd=Double.toString(fn);
				fnName="";
			}
			else if(fnName.equals("ln(")) {
				double fnOpernd=Double.valueOf(opernd);
				double fn=Math.log10(fnOpernd);
				opernd=Double.toString(fn);
				fnName="";
			}
			
			
		}
		else {
			double a=Double.valueOf(operndValue);
			double b=Double.valueOf(opernd);
		
			Operation(opr,a,b);
			opernd=operndValue;
			operndValue=tempVal;
			opr=tempOpr;
		}
	}
	public void Equals(String sopr) {
		exp+=sopr;
		
		if(operndValue.equals("")) {
			exp+=opernd;
			f.l1.setText(exp);	
		}
		else {
			double a=Double.valueOf(operndValue);
			double b=Double.valueOf(opernd);
		
			switch (opr) {
			case "+":
				double s=a+b;
				String sum=Double.toString(s);
				exp+=sum;
				f.l1.setText(exp);
				break;
		
			case "-":
				double su=a-b;
				String sub=Double.toString(su);
				exp+=sub;
				f.l1.setText(exp);
				break;
			case "*":
				double m=a*b;
				String mul=Double.toString(m);
				exp+=mul;
				f.l1.setText(exp);
				break;
			case "/":
				double d=a/b;
				String div=Double.toString(d);
				exp+=div;
				f.l1.setText(exp);
				break;
			case "**":
				double p=Math.pow(a,b);
				String pow=Double.toString(p);
				exp+=pow;
				f.l1.setText(exp);
				break;
			
			default:
				break;	
			}
		
		}
	}
	
	
}
