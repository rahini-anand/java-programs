package pgm7_B3Nos;

public class B3Nos {

	private int x,y,z,big;
	
	public B3Nos() {
		x=10;
		y=20;
		z=30;
		
	}
	
	public void find() {
		big=x>y?((x>z)?x:z):((y>z)?y:z);
	}
	
	public void display() {
		System.out.print(big);
	}
}
