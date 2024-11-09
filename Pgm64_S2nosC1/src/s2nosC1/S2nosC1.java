package s2nosC1;


public class S2nosC1 {
	private int x,y,s;
	
	public S2nosC1() {
		x=10;
		y=20;
	}
	public S2nosC1(int a,int b) {
		x=a;
		y=b;
	}
	public S2nosC1(S2nosC1 s) {
		x=s.x;
		y=s.y;
	}
	public void setX(int a) {
		x=a;
	}
	public void setY(int b) {
		y=b;
	}
	public void setObj(S2nosC1 s) {
		x=s.x;
		y=s.y;
	}
	public void reset() {
		x=10;
		y=20;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getS() {
		return s;
	}
	public S2nosC1 getObj() {
		return this;
	}
	public void display() {
		System.out.println(s);
	}
	public static void displayConstructor() {
		System.out.println("Constructors");
		System.out.println("S2nosC1()");
		System.out.println("S2nosC1(int a,int b)");
		System.out.println("S2nosC1(S2nosC1 s)");
		System.out.println("---------------------------");
	}
	public static void Methods() {
		System.out.println("Setter Functions");
		
		System.out.println("public void setX(int a)");
		System.out.println("public void setY(int b)");
		System.out.println("public void setObj(S2nosC1 s)");
		System.out.println("public void reset()");
		System.out.println("----------------------------");

		System.out.println("Getter Functions");
		System.out.println("public int getX()");
		System.out.println("public int getY()");
		System.out.println("public int getS()");
		System.out.println("public S2nosC1 getObj()");
		System.out.println("----------------------------");
		System.out.println("public void display()");
		System.out.println("----------------------------");

	}
	public static void InstanceVariables(){
		System.out.println("Instance Variables");
		System.out.println("private int x");
		System.out.println("private int y");
		System.out.println("private int s");
		System.out.println("----------------------------");

	}
}
