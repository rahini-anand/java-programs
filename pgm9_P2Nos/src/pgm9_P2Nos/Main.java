package pgm9_P2Nos;

public class Main {
	public static void main (String args[]) {
		
		P2Nos p1=new P2Nos();
		P2Nos p2=new P2Nos(2.5f);
		P2Nos p3=new P2Nos(8.5f,1.1f);
		P2Nos p4=new P2Nos(p1);
		
		p1.find();
		p1.display();
		
		p2.find();
		p2.display();
		
		p3.find();
		p3.display();
		
		p4.find();
		p4.display();
		
	}
}
