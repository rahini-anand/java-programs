package pgm10_B3Nos;

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
	
	public B3Nos (int a, int b, int c) {
		x=a;
		y=b;
		z=c;
	}
	
	public B3Nos (B3Nos b) {
		x=b.x;
		y=b.y;
		z=b.z;
	}
	
	public void find () {
		big= x>y?((x>z)?x:z):((y>z)?y:z);
	}
	
	public void display() {
		System.out.println(big);
	}
}
