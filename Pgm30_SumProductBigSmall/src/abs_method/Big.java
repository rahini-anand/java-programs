package abs_method;

import calculate.Calculate;
public class Big extends Calculate{
	private int x,y,z,result;
	
	public void set() {
		x=10;
		y=200;
		z=500;
	}
	
	public void find() {
		result=x>y?(x>z?x:z):(y>z?y:z);
	}
	
	public void display() {
		System.out.println("Big:"+result);
	}
}
