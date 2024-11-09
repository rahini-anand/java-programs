package sbClass1;

public class SbClass1 {
	static int x,y,z;
	private int a,b,c,big;
	
	static {x=(int)(Math.random()*100);}
	static {y=(int)(Math.random()*100);}
	static {z=(int)(Math.random()*100);}
	public SbClass1() {
		a=x;
		b=y;
		c=z;
	}
	
	
	public void find() {
		big=a>b?(a>c?a:c):(b>c?b:c);
	}
	public void display() {
		System.out.println("Big:"+big);
	}

}
