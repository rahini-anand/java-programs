package abs_method;

import calculate.Calculate;
public class Product extends Calculate{
	private int x,y,z,result;
	
	public void set() {
		x=100;
		y=2;
		z=1;
	}
	
	public void find() {
		result=x*y*z;
	}
	
	public void display() {
		System.out.println("Product:"+result);
	}
}
