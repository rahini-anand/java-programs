package abs_method;

import calculate.Calculate;
public class Small extends Calculate {
	
	private int x,y,z,result;
	
	public void set() {
		x=100;
		y=200;
		z=15;
	}
	
	public void find() {
		result=x<y?(x<z?x:z):(y<z?y:z);
	}
	
	public void display() {
		System.out.println("Small:"+result);
	}

}
