package op3nos_pro;

import a3nos_pro.A3Nos_pro;
public class OP3Nos_pro extends A3Nos_pro {
	public OP3Nos_pro() {
		x=10;
		y=20;
		z=15;
	}
	public OP3Nos_pro(int a) {
		x=a;
		y=20;
		z=15;
	}
	public OP3Nos_pro(int a,int b) {
		x=a;
		y=b;
		z=15;
	}
	public OP3Nos_pro(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	public OP3Nos_pro(OP3Nos_pro a) {
		x=a.x;
		y=a.y;
		z=a.z;
	}
	public int sum() {
		int s=x+y+z;
		return s;
	}
}
