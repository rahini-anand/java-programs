package Pgm11_S2Nos;

public class S2Nos{
	private int x,y,s;
	
	public S2Nos() {
		x=10;
		y=20;
	}
	
	public void setx(int a) {
		x=a;
		y=20;
	}
	
	public void sety(int b) {
		x=10;
		y=b;
	}
	
	public void setxy(int a, int b) {
		x=a;
		y=b;
	}
	
	public void setobj(S2Nos s) {
		x=s.x;
		y=s.y;
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
	
	public int getsum() {
		return s;
	}
	
	public void find() {
		s=x+y;
	}
	
	public void display() {
		System.out.println(s);
	}
}