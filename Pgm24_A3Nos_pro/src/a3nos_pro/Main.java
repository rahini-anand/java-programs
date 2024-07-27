package a3nos_pro;


public class Main {
	public static void main(String args[]){
		A3Nos_pro a,a1,a2,a3,a4;
		
		a=new A3Nos_pro();
		a1=new A3Nos_pro(50);
		a2=new A3Nos_pro(100,200);
		a3=new A3Nos_pro(1,2,3);
		a4=new A3Nos_pro(a2);
		
		a.display_all();
		a1.display_all();
		a2.display_all();
		a3.display_all();
		a4.display_all();
		
		a.set(50);
		a.display_all();
		
		a.set(10, 30, 45);
		a.display_all();
		
		a2.set();
		a2.display_all();
		
		int z1=a.getz();
		System.out.println("z1:"+z1);
		
		A3Nos_pro a5=a.getobj();
		a5.display_all();
		
		a.display();
		
	}
}
