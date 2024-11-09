package s2nosAbstract;

public class Pgm56Main {
	public static void main(String args[]) {
		S2nosAbstract a=new S2nosAbstract() {
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
