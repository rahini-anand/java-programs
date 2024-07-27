package op3nos;

import a3nos.A3Nos;
public class OP3Nos extends A3Nos {
	public OP3Nos() {
		super();
	}
	
	public OP3Nos(int x) {
		super(x);
	}
	
	public OP3Nos(int x, int y) {
		super(x,y);
	}
	public OP3Nos(int a, int b,int c) {
		super(a,b,c);
	}
	
	public OP3Nos(OP3Nos op) {
		super(op);
	}
	public int sum() {
		int a=getx();
		int b=gety();
		int c=getz();
		
		int s=a+b+c;
		return s;
	}
	
	public int product() {
		int a=getx();
		int b=gety();
		int c=getz();
		
		int p=a*b*c;
		return p;
	}
	public int big_three() {
		int a=getx();
		int b=gety();
		int c=getz();
		
		int big=a>b?((a>c)?a:c):((b>c)?b:c);
		return big;
	}
	
	public int small_three() {
		int a=getx();
		int b=gety();
		int c=getz();
	
		int small=a<b?((a<c)?a:c):((b<c)?b:c);
		return small;
	}
	

}
