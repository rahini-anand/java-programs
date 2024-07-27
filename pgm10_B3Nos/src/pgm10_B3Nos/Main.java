package pgm10_B3Nos;

public class Main {
	public static void main(String args[]) {
		
		B3Nos b1=new B3Nos();
		B3Nos b2=new B3Nos(40);
		B3Nos b3=new B3Nos(8,5);
		B3Nos b4=new B3Nos(35,10,25);
		B3Nos b5=new B3Nos(b1);
		
		b1.find();
		b1.display();
		
		b2.find();
		b2.display();
		
		b3.find();
		b3.display();
		
		b4.find();
		b4.display();
		
		b5.find();
		b5.display();
	}
	
}
