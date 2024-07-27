package pgm4_B3Nos;

public class B3Nos {
	private int x,y,z,big;
	
	public void set() {
		
		x=10;
		y=20;
		z=15;
	}
	
	public void find() {
		big=x>y?((x>z)?x:z):((y>z)?y:z);
	}
	
	public void display() {
		System.out.print(big);
	}
}
