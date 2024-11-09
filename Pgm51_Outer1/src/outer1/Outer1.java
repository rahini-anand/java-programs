package outer1;

public class Outer1 {
	public class B3nos{
		private int x,y,z,b;
		public void set() {
			x=10;
			y=20;
			z=15;
		}
		
		public void find() {
			b=x>y?(x>z?x:z):(y>z?y:z);
		}
		
		public void display() {
			System.out.println("Big:"+b);
		}
	}
	
	public void calculate() {
		B3nos b=new B3nos();
		
		b.set();
		b.find();
		b.display();
	}

}
