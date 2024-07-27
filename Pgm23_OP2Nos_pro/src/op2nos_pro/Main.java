package op2nos_pro;

public class Main {
	public static void main(String args[]){
		OP2Nos_pro a,a1,a2,a3;
		
		a=new OP2Nos_pro();
		a1=new OP2Nos_pro(40);
		a2=new OP2Nos_pro(800,400);
		a3=new OP2Nos_pro(a2);
		
		a.display();
		a1.display();
		a2.display();
		a3.display();
		
		int s=a.sum();
		int dif=a.difference();
		int p=a.product();
		int div=a2.division();
		int mod=a2.modulus();
		int big2=a.big();
		int small2=a.small();
		
		System.out.println("Sum:"+s);
		System.out.println("difference:"+dif);
		System.out.println("product:"+p);
		System.out.println("division:"+div);
		System.out.println("modulus:"+mod);
		System.out.println("big:"+big2);
		System.out.println("small:"+small2);
	}
}
