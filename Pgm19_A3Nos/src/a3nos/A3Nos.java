package a3nos;
import a2nos.A2Nos;
public class A3Nos extends A2Nos{
	
	private int z;
	
	public A3Nos() {
		super();
		z=50;
	}
	
	public A3Nos(int x) {
		super(x);
		z=50;
	}
	
	public A3Nos(int x, int y) {
		super(x,y);
		z=50;
	}
	public A3Nos(int a,int b,int c) {
		super(a,b);
		z=c;
		
	}
	public A3Nos(A3Nos a) {
		super(a);
		z=a.z;
	}
	
	public void setz(int c) {
		z=c;
	}
	
	public void setxyz(int x,int y,int z) {
		set(x,y);
		this.z=z;
	}
	
	public void setobj(A3Nos a) {
		set(a);
		this.z=a.z;
	}
	
	public void reset() {
		super.reset();
		z=50;
	}
	public int getz() {
		return z;
	}
	
	public A3Nos getobj() {
		return this;
	}
	
	public void display_z() {
		System.out.println("z:"+z);
	}
	
	public void display_all() {
		display();
		System.out.println("z:"+z);
	}
		

}
