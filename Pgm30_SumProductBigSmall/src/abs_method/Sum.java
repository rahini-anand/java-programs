package abs_method;
 
import calculate.Calculate;
public class Sum extends Calculate {
	private int x,y,z,result;
	
	public void set() {
		x=10;
		y=20;
		z=15;
	}
	
	public void find() {
		result=x+y+z;
	}
	
	public void display() {
		System.out.println("Sum:"+result);
	}
}
