package Pgm12_B3Nos;


public class Main {
public static void main(String args[]) {
		
		
		B3Nos b,b1,b2,b3,b4;
		
		b=new B3Nos();
		b1=new B3Nos(40);
		b2=new B3Nos (50,60);
		b3=new B3Nos(40,20,80);
		b4=new B3Nos(b2);
		
		b.find();
		b.display();
		
		b1.find();
		b1.display();
		
		b2.find();
		b2.display();
		
		b3.find();
		b3.display();
		
		b4.find();
		b4.display();
		
		b.setx(100);
		b.find();
		b.display();
		
		b.sety(110);
		b.find();
		b.display();
		
		b.setz(500);
		b.find();
		b.display();
		
		b.setxyz(1000,200,300);
		b.find();
		b.display();
		
		b.setobj(b2);
		b.find();
		b.display();
		
		b.reset();
		b.find();
		b.display();

		int x=b.getx();
		int y=b.gety();
		int z=b.getz();
		int big1=b.getbig();
		B3Nos b5=b.getobj();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(big1);
		b5.display();
	}
}
