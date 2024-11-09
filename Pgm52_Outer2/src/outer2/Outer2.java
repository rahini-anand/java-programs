package outer2;

public class Outer2 {
	private int x,y,s;
	public class S2nos{
		
		public void set() {
			x=10;
			y=20;
		}
		public void find() {
			s=x+y;
		}
		public void display() {
			System.out.println("Sum:"+s);
		}
	}
	
	public void Calculate() {
		S2nos s=new S2nos();
		
		s.set();
		s.find();
		s.display();
	}

}

