package Pgm11_S2Nos;

public class Main {
	public static void main(String args[]) {
		S2Nos s=new S2Nos();
		S2Nos s1=new S2Nos();
		
		s.find();
		s.display();
		
		s.setx(5);
		s.find();
		s.display();
		
		s.sety(15);
		s.find();
		s.display();
	
		s.setxy(20,40);
		s.find();
		s.display();
		
		s.setobj(s1);
		s.find();
		s.display();
		
		s.reset();
		s.find();
		s.display();
		
	}
		
}
