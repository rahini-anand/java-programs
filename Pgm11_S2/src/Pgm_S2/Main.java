package Pgm_S2;


public class Main {
	public static void main(String args[]) {
		S2 s=new S2();
		S2 s1=new S2();
		
		s.find();
		s.display();
		
		s.setx(5);
		s.find();
		s.display();
		
		s.sety(100);
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
		
		
		int x=s.getx();
		int y=s.gety();
		int sum=s.getsum();
		S2 obj=s.getobj();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(sum);
		obj.display();
	}
}
