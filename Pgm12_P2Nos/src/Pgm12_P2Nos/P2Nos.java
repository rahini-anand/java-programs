package Pgm12_P2Nos;

public class P2Nos {

	private float x,y,p;
	
	public P2Nos() {
		x=3.5f;
		y=2.1f;
	}
	
	public P2Nos(float a) {
		x=a;
		y=2.1f;
	}
	
	public P2Nos(float a, float b) {
		x=a;
		y=b;
	}
	
	public P2Nos (P2Nos p) {
		x=p.x;
		y=p.y;
	}
	
	public void setx(float a) {
		x=a;
	}
	
	public void sety(float b) {
		y=b;
	}
	
	public void setxy(float a, float b) {
		x=a;
		y=b;
	}
	
	public void setobj(P2Nos p) {
		x=p.x;
		y=p.y;
	}
	
	public void reset() {
		x=3.5f;
		y=2.1f;
	}
	
	public float getx() {
		return x;
	}
	
	public float gety() {
		return y;
	}
	
	public float getproduct() {
		return p;
	}
	
	public P2Nos getobj() {
		return this;
	}
	
	public void find() {
		p=x*y;
	}
	
	public void display() {
		System.out.println(p);
	}
}
