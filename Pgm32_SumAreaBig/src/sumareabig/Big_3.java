package sumareabig;

import calculate_interface.Calculate;
public class Big_3 {
	
	private int x,y,z,big;
	
	public void set() {
		x=10;
		y=20;
		z=15;
	}
	
	public void find() {
		big=x>y?(x>z?x:z):(y>z?y:z);
	}
	
	public void display() {
		System.out.println("Big:"+big);
	}

}
