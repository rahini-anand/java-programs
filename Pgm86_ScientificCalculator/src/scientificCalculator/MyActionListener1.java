package scientificCalculator;

import java.awt.event.*;



public class MyActionListener1 implements ActionListener {
	
	private MyFrame15 f;
	private String exp="";
	private String opernd="";
	private String operndValue="";
	private String opr="";
	private String oldOpr="";
	private String tempOpr="";
	private String tempVal="";
	private String fnName="";
	
	public MyActionListener1(MyFrame15 f15) {
		f=f15;
	}
	
	public void Digit_opernd(String copr) {
		
		switch (copr) {
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
		default:
			break;
		}
		
	}
	
	public void Operation(String copr,double a,double b) {
		switch (copr) {
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
	
	public void Operator(String copr) {
		switch (copr) {
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
		
	public void OpeningBracket(String copr) {
		exp+="(";
		f.l1.setText(exp);
		tempVal=operndValue;
		tempOpr=opr;
		operndValue="";
		opr="";
			
	}
	
	public void ClosingBracket(String copr) {
		
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
	
	public void Equals() {
		exp+="=";
		
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
		
	public void Clear(String copr) {
		exp="";
		f.l1.setText(exp);
		
		opernd="";
		operndValue="";
		opr="";
		tempOpr="";
		tempVal="";
		oldOpr="";
	}
		
		
	public void actionPerformed(ActionEvent e) {
		String COpr=e.getActionCommand();
		
		
		
		switch (COpr) {
		
		case "1":
			Digit_opernd(COpr);
			break;
			
		case "2":
			Digit_opernd(COpr);
			break;
		case "3":
			Digit_opernd(COpr);
			break;
		case "4":
			Digit_opernd(COpr);
			break;
		case "5":
			Digit_opernd(COpr);
			break;
		case "6":
			Digit_opernd(COpr);
			break;
		case "7":
			Digit_opernd(COpr);
			break;
		case "8":
			Digit_opernd(COpr);
			break;
		case "9":
			Digit_opernd(COpr);
			break;
		case ".":
			Digit_opernd(COpr);
			break;
		case "0":
			Digit_opernd(COpr);
			break;
		case "+":
			Operator(COpr);
			break;
			
		case "-":
			Operator(COpr);
			break;
			
		case "*":
			Operator(COpr);
			break;
			
		case "/":
			Operator(COpr);
			break;
		
		case "(":
			OpeningBracket(COpr);
			break;
			
		case ")":
			ClosingBracket(COpr);
			break;
		case "=":
			Equals();
			break;
			
		case "Clear":
			Clear(COpr);
			break;
		case "sin":
			exp+="sin(";
			fnName="sin";
			f.l1.setText(exp);
			break;	
		case "cos":
			exp+="cos(";
			fnName="cos";
			f.l1.setText(exp);
			break;	
		case "tan":
			exp+="tan(";
			fnName="tan";
			f.l1.setText(exp);
			break;
		case "Pi":
			exp+="3.14";
			f.l1.setText(exp);
			opernd="3.14";
			break;
		case "Sqrt":
			exp+="Sqrt(";
			fnName="Sqrt";
			f.l1.setText(exp);
			break;
		case "Cbrt":
			exp+="cbrt(";
			fnName="cbrt";
			f.l1.setText(exp);
			break;
		case "Square":
			exp+="sqr(";
			fnName="sqr";
			f.l1.setText(exp);
			break;
		case "cube":
			exp+="cub(";
			fnName="cub";
			f.l1.setText(exp);
			break;
		case "**":
			Operator(COpr);
			break;
		case "e**x":
			exp+="e**(";
			fnName="e**";
			f.l1.setText(exp);
			break;
		case "inverse(x)":
			exp+="inv(";
			fnName="inv(x)";
			f.l1.setText(exp);
			break;
		case "e":
			exp+="e(";
			fnName="e";
			f.l1.setText(exp);
			break;
		case "log":
			exp+="log(";
			fnName="log(";
			f.l1.setText(exp);
			break;
		case "ln":
			exp+="ln(";
			fnName="ln(";
			f.l1.setText(exp);
			break;
		default:
			break;
			
		}	
			
	}

}
