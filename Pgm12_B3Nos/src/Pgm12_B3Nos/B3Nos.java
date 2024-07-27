package Pgm12_B3Nos;

public class B3Nos {
	private int x,y,z,big;
	
	public B3Nos() {
		x=10;
		y=20;
		z=15;
	}
	
	public B3Nos(int a) {
		x=a;
		y=20;
		z=15;
	}
	
	public B3Nos(int a, int b) {
		x=a;
		y=b;
		z=15;
	}
	
	public B3Nos(int a, int b, int c) {
		x=a;
		y=b;
		z=c;
	}
	
	public B3Nos (B3Nos b) {
		x=b.x;
		y=b.y;
		z=b.z;
	}
	
	public void setx(int a) {
		x=a;
	}
	
	public void sety(int b) {
		y=b;
	}
	
	public void setz(int c) {
		z=c;
	}
	
	public void setxyz(int a, int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	
	public void setobj(B3Nos b) {
		x=b.x;
		y=b.y;
		z=b.z;
	}
	
	public void reset() {
		x=10;
		y=20;
		z=15;
	}
	
	public int getx() {
		return x;
	}
	
	public int gety() {
		return y;
	}
	
	public int getz() {
		return z;
	}
	
	public int getbig() {
		return big;
	}
	
	public B3Nos getobj() {
		return this;
	}
	
	public void find() {
		big=x>y?((x>z)?x:z):((y>z)?y:z);
	}
	
	public void display() {
		System.out.println(big);
	}
}
