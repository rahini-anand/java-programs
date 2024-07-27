package op2nos;

public class Main {
	public static void main(String args[]) {
		OP2Nos ap,ap1,ap2,ap3;
		
		ap=new OP2Nos();
		ap1=new OP2Nos(100);
		ap2=new OP2Nos(800,500);
		ap3=new OP2Nos(ap1);
		
		ap.display();
		ap1.display();
		ap2.display();
		ap3.display();
		
		int sum=ap1.sum();
		int prod=ap1.product();
		int div=ap1.divi();
		int mod=ap1.mod();
		
		System.out.println("Sum:"+sum);
		System.out.println("product:"+prod);
		System.out.println("division:"+div);
		System.out.println("modulus:"+mod);
	}
}
