package sumareabig;

import calculate_interface.Calculate;

public class Sum implements Calculate{
	private int x,y,s;
	
	public void set() {
		x=10;
		y=20;
	}
	
	public void find() {
		s=x+y;
	}
	public void display() {
		System.out.println("Sum:"+s);
	}
}
