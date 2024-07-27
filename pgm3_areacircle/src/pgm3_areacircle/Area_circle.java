package pgm3_areacircle;

public class Area_circle {
	private float pi,r,ar;
	
	public void set() {
		pi=3.14f;
		r=2.1f;
	}
	
	public void find() {
		ar=pi*r*r;
	}
	
	public void display() {
		System.out.print(ar);
	}
}
