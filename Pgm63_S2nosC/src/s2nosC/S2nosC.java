package s2nosC;

public class S2nosC {
	private int x,y,s;
	static int count=0;
	
	public S2nosC() {
		x=10;
		y=20;
		count+=1;
	}
	public S2nosC(int a,int b) {
		x=a;
		y=b;
		count+=1;
	}
	public S2nosC(S2nosC s) {
		x=s.x;
		y=s.y;
		count+=1;
	}
	public void set() {
		x=10;
		y=20;
	}
	public void find() {
		s=x+y;
	}
	public void display() {
		System.out.println(s);
	}
}
