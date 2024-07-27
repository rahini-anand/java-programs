package pgm9_P2Nos;

public class P2Nos {
	private float x,y,p;
	
	public P2Nos(){
		x=3.5f;
		y=2.1f;
	}
	
	public P2Nos(float a) {
		x=a;
		y=2.1f;
	}
	
	public P2Nos (float a, float b) {
		x=a;
		y=b;
	}
	
	public P2Nos (P2Nos p) {
		x=p.x;
		y=p.y;
	}
	
	public void find() {
		p=x*y;
	}
	
	public void display() {
		System.out.println(p);
	}
		
	
}
