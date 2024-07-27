package a2nos1;


public class Main {
	public static void main(String args[]) {
		A2Nos1 a,a1,a2,a3;
		
		a=new A2Nos1();
		a1=new A2Nos1(100);
		a2=new A2Nos1(800,400);
		a3=new A2Nos1(a2);
		
		a.display();
		a1.display();
		a2.display();
		a3.display();
		
		a.set(200);
		a.display();
		
		a.set(1000,2000);
		a.display();
		
		a.set(a2);
		a.display();
		
		a.set();
		a.display();
		
		int x1=a.getx();
		int y1=a.gety();
		A2Nos1 a4=a1.getobj();
		
		System.out.println(x1);
		System.out.println(y1);
		a4.display();
	}
}
