package cal3nos;

public abstract class Cal3Nos {
	protected int x,y,z,result;
	
	public void set() {
		x=10;
		y=20;
		z=15;
	}
	
	public abstract void find();
	
	public void display() {
		System.out.println(result);
	}
		
}
