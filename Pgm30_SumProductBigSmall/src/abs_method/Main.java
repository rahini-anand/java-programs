package abs_method;

public class Main {
	public static void main(String args[]) {
		
		Sum s=new Sum();
		s.set();
		s.find();
		s.display();
		
		Product p=new Product();
		p.set();
		p.find();
		p.display();
		
		Big b=new Big();
		b.set();
		b.find();
		b.display();
		
		Small sm=new Small();
		sm.set();
		sm.find();
		sm.display();
	}
}
