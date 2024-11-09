package sbClass;

public class SbClass {
	static int x,y;
	private int a,b,s;
	
	static {x=(int)(Math.random()*100);}
	static {y=(int)(Math.random()*100);}
	public SbClass() {
		a=x;
		b=y;
	}
	
	
	public void find() {
		s=a+b;
	}
	public void display() {
		System.out.println("Sum:"+s);
	}

}
