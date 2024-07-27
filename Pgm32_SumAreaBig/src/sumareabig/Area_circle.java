package sumareabig;

import calculate_interface.Calculate;
public class Area_circle implements Calculate{
	private float r,area;
	public void set() {
		r=2.1f;
	}
	
	public void find() {
		area=3.14f*r*r;
	}
	
	public void display() {
		System.out.println("area:"+area);
	}
}
