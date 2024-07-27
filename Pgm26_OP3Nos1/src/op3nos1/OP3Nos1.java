package op3nos1;

import a3nos_pro.A3Nos_pro;
public class OP3Nos1 extends A3Nos_pro {
	
	public OP3Nos1() {
		x=10;
		y=20;
		z=15;
	}
	public OP3Nos1(int a) {
		x=a;
		y=20;
		z=15;
	}
	public OP3Nos1(int a,int b) {
		x=a;
		y=b;
		z=15;
	}
	public OP3Nos1(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	public OP3Nos1(OP3Nos1 a) {
		x=a.x;
		y=a.y;
		z=a.z;
	}
	public int sum() {
		int s=x+y+z;
		return s;
	}
	public int difference() {
		int d=x-y-z;
		return d;
	}
	public int product() {
		int p=x*y*z;
		return p;
	}
	public float division() {
		int d=(x/y)/z;
		return d;
	}
	public int big() {
		int big=x>y?((x>z)?x:z):((y>z)?y:z);
		return big;
	}
	public int small() {
		int big=x<y?((x<z)?x:z):((y<z)?y:z);
		return big;
	}
}
