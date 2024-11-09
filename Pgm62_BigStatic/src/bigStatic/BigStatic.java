package bigStatic;

public class BigStatic {

	static int x,y,z;
	private int b;
	
	public void find() {
		b=x>y?(x>z?x:z):(y>z?y:z);
	}
	
	public void display() {
		System.out.println("Big:"+b);
	}
}
