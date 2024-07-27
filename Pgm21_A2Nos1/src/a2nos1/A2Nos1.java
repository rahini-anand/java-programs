package a2nos1;

public class A2Nos1 {
protected int x,y;
	
	public A2Nos1(){
		x=10;
		y=20;
	}
	
	public A2Nos1(int a) {
		x=a;
		y=20;
	}
	public A2Nos1(int a,int b) {
		x=a;
		y=b;
	}
	public A2Nos1(A2Nos1 a) {
		x=a.x;
		y=a.y;
	}
	
	public void set(int a) {
		x=a;
	}
	public void set(int a, int b) {
		x=a;
		y=b;
	}
	
	public void set(A2Nos1 a) {
		x=a.x;
		y=a.y;
	}
	
	public void set() {
		x=10;
		y=20;
	}
	
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public A2Nos1 getobj() {
		return this;
	}
	
	public void display() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}
