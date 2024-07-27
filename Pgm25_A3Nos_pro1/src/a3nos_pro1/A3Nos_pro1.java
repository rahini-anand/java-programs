package a3nos_pro1;

import a2nos1.A2Nos1;

public class A3Nos_pro1 extends A2Nos1 {
	private int z;
	public A3Nos_pro1() {
		x=10;
		y=20;
		z=15;
	}
	public A3Nos_pro1(int a) {
		x=a;
		y=20;
		z=15;
	}
	public A3Nos_pro1(int a,int b) {
		x=a;
		y=b;
		z=15;
	}
	public A3Nos_pro1(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	public A3Nos_pro1(A3Nos_pro1 a) {
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
	public void set(A3Nos_pro1 a) {
		x=a.x;
		y=a.y;
		z=a.z;
	}
	public void set() {
		x=10;
		y=20;
		z=15;
	}
	public int getz() {
		return z;
	}
	public A3Nos_pro1 getobj() {
		return this;
	}
	public void display() {
		System.out.println("z:"+z);
	}
	public void display_all() {
		super.display();
		System.out.println(z);
	}
}
