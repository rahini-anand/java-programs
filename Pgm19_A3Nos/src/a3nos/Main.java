package a3nos;

public class Main {
	public static void main(String args[]) {
		A3Nos a,a1,a2,a3;
		
		a=new A3Nos();
		a1=new A3Nos(100);
		a2=new A3Nos(800,400);
		a3=new A3Nos(a1);
		
		a.display_all();
		a1.display_all();
		a2.display_all();
		a3.display_all();
		
		a1.setz(80);
		a1.display_all();
		
		a1.setxyz(1, 2, 3);
		a1.display_all();
		
		a1.setobj(a2);
		a1.display_all();
		
		a2.reset();
		a2.display_all();
		
		int z1=a3.getz();
		A3Nos a4=a2.getobj();
		
		System.out.println("z1:"+z1);
		a4.display_all();
		
	}
}
