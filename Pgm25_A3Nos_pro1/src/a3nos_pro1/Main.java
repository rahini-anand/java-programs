package a3nos_pro1;

public class Main {
	public static void main(String args[]){
		A3Nos_pro1 a,a1,a2,a3,a4;
		
		a=new A3Nos_pro1();
		a1=new A3Nos_pro1(50);
		a2=new A3Nos_pro1(17,275,175);
		a3=new A3Nos_pro1(1,2);
		a4=new A3Nos_pro1(a2);
		
		a.display_all();
		a1.display_all();
		a2.display_all();
		a3.display_all();
		a4.display_all();
		
		a.set(50);
		a.display_all();
		
		a.set(10, 30, 45);
		a.display_all();
		
		a.set(a2);
		a.display_all();
		
		a1.set();
		a1.display_all();
		
		int z1=a.getz();
		System.out.println("z1:"+z1);
		
		a.display();
		
		A3Nos_pro1 a5=a.getobj();
		a5.display_all();
	}
}
