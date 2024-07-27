package a2nos;

public class Main {
	public static void main(String args[]) {
		A2Nos a,a1,a2,a3;
		
		a=new A2Nos();
		a1=new A2Nos(5);
		a2=new A2Nos(6,16);
		a3=new A2Nos(a1);
		
		a.display();
		a1.display();
		a2.display();
		a3.display();
		
		a.set(100);
		a.display();
		
		a.set(1000,500);
		a.display();
		
		a.set(a1);
		a.display();
		
		a.reset();
		a.display();
		
		
		int x=a.getx();
		int y=a.gety();
		A2Nos a4=a1.getobj();
		
		
		System.out.println(x);
		System.out.println(y);
		a4.display();
	}
	
	
	
	
}
