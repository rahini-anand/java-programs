package Pgm12_P2Nos;

public class Main {

	public static void main(String args[]) {
		
		
		P2Nos p,p1,p2,p3;
		
		p=new P2Nos();
		p1=new P2Nos(7.1f);
		p2=new P2Nos (11.2f,1.1f);
		p3=new P2Nos(p1);
		
		p.find();
		p.display();
		
		p1.find();
		p1.display();
		
		p2.find();
		p2.display();
		
		p3.find();
		p3.display();
		
		p.setx(1.1f);
		p.find();
		p.display();
		
		p.sety(100.1f);
		p.find();
		p.display();
		
		p.setxy(1000.1f,1000.1f);
		p.find();
		p.display();
		
		p.setobj(p2);
		p.find();
		p.display();
		
		p.reset();
		p.find();
		p.display();

		float x=p.getx();
		float y=p.gety();
		float product=p.getproduct();
		P2Nos p4=p.getobj();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(product);
		p4.display();
		
		
	}
}
