package op2nos_pro;

import a2nos1.A2Nos1;
public class OP2Nos_pro extends A2Nos1 {
	
	public OP2Nos_pro() {
		x=10;
		y=20;
	}
	
	public OP2Nos_pro(int a) {
		x=a;
		y=20;
	}
	public OP2Nos_pro(int a, int b) {
		x=a;
		y=b;
	}
	public OP2Nos_pro(OP2Nos_pro a) {
		x=a.x;
		y=a.y;
	}
	public int sum() {
		int s=x+y;
		return s;
	}
	
	public int difference() {
		int dif=x-y;
		return dif;
	}
	public int product() {
		int p=x*y;
		return p;
	}
	public int division() {
		
		int div=x/y;
		return div;
	}
	public int modulus() {
		int mod=x%y;
		return mod;
	}
	public int big() {
		int big2=x>y?x:y;
		return big2;
	}
	public int small() {
		int small2=x<y?x:y;
		return small2;
	}

}
