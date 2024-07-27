package op2nos;

import a2nos.A2Nos;
public class OP2Nos extends A2Nos{
	
	public OP2Nos() {
		super();
	}
	
	public OP2Nos(int a) {
		super(a);
	}
	
	public OP2Nos(int a, int b) {
		super(a,b);
	}
	public OP2Nos(OP2Nos ap) {
		super(ap);
	}
	
	public int sum() {
		int x=getx();
		int y=gety();
		
		int s=x+y;
		
		return s;
	}
	
	public int product() {
		int x=getx();
		int y=gety();
		
		int p=x*y;
		return p;
	}
	
	public int divi() {
		int x=getx();
		int y=gety();
		
		int d=x/y;
		return d;
	}
	
	public int mod() {
		int x=getx();
		int y=gety();
		
		int m=x%y;
		return m;
	}
	

}
