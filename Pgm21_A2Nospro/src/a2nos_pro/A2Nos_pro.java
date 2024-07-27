package a2nos_pro;
	
public class A2Nos_pro {
	protected int x,y;
	
	public A2Nos_pro(){
		x=10;
		y=20;
	}
	
	public A2Nos_pro(int a) {
		x=a;
		y=20;
	}
	public A2Nos_pro(int a,int b) {
		x=a;
		y=b;
	}
	public A2Nos_pro(A2Nos_pro a) {
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
	
	public void set(A2Nos_pro a) {
		x=a.x;
		y=a.y;
	}
	
	public void reset() {
		x=10;
		y=20;
	}
	
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public A2Nos_pro getobj() {
		return this;
	}
	
	public void display() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}
