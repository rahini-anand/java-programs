package areaStatic;

public class AreaStatic {

	static float r;
	private float a;
	
	public void find() {
		float pi=3.14f;
		a=pi*r*r;
	}
	
	public void display() {
		System.out.println("AreaCircle:"+a);
	}
}
