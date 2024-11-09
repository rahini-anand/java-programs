package outer3;

public class Outer3 {
	private int x,y,z,b;
	public class B3nos{
		
		public void set() {
			x=10;
			y=20;
			z=25;
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
