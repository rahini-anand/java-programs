package a3nos_pro;

import a2nos1.A2Nos1;
public class A3Nos_pro extends A2Nos1{
	protected int z;
	public A3Nos_pro() {
		x=10;
		y=20;
		z=15;
	}
	public A3Nos_pro(int a) {
		x=a;
		y=20;
		z=15;
	}
	public A3Nos_pro(int a,int b) {
		x=a;
		y=b;
		z=15;
	}
	public A3Nos_pro(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	public A3Nos_pro(A3Nos_pro a) {
		x=a.x;
		y=a.y;
		z=a.z;
	}
	public void set(int c) {
		z=c;
	}
	public void set(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	public void set(A3Nos_pro a) {
		x=a.x;
		y=a.y;
		z=a.z;
	}
	public void set() {
		x=10;
		y=15;
		z=15;
	}
	public int getz() {
		return z;
	}
	public A3Nos_pro getobj() {
		return this;
	}
	public void display() {
		System.out.println(z);
	}
	public void display_all() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}
}
