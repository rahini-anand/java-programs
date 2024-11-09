package s2nosInterface;

public class Pgm55Main {
	public static void main(String args[]) {
		S2nosInterface a=new S2nosInterface() {
			int x,y,s;
			
			public void set() {
				x=10;
				y=30;
			}
			
			public void find() {
				s=x+y;
			}
			public void display() {
				System.out.println("Sum:"+s);
			}
		};
		
		a.set();
		a.find();
		a.display();
	}
}
