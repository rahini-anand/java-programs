package pgm8_S2nos;

public class S2Nos {
	private int x,y,s;
	
	public S2Nos(){
		x=10;
		y=20;
	}
	
	public S2Nos(int a) {
		x=a;
		y=20;
	}
	
	public S2Nos(int a, int b) {
		x=a;
		y=b;
	}
	
	public S2Nos (S2Nos s) {
		x=s.x;
		y=s.y;
	}
	
	public void find() {
		s=x+y;
	}
	
	public void display() {
		System.out.println(s);
	}
}
