package a2nos_pro;

public class Main {
	public static void main(String args[]) {
		A2Nos_pro a,a1,a2,a3;
		
		a=new A2Nos_pro();
		a1=new A2Nos_pro(100);
		a2=new A2Nos_pro(800,400);
		a3=new A2Nos_pro(a2);
		
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
		
		a.reset();
		a.display();
		
		int x1=a.getx();
		int y1=a.gety();
		A2Nos_pro a4=a1.getobj();
		
		System.out.println(x1);
		System.out.println(y1);
		a4.display();
	}
}
