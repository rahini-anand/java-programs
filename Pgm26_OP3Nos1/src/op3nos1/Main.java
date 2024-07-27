package op3nos1;

public class Main {
	public static void main(String args[]) {
		OP3Nos1 a,a1,a2,a3,a4;
		
		a=new OP3Nos1();
		a1=new OP3Nos1(11);
		a2=new OP3Nos1(25,50);
		a3=new OP3Nos1(75,175,275);
		a4=new OP3Nos1(a2);
		
		a.display_all();
		a1.display_all();
		a2.display_all();
		a3.display_all();
		a4.display_all();
		
		int s=a.sum();
		int dif=a.difference();
		int p=a.product();
		float div=a.division();
		int big=a.big();
		int small=a.small();
		
		System.out.println("sum:"+s);
		System.out.println("difference:"+dif);
		System.out.println("product:"+p);
		System.out.println("division:"+div);
		System.out.println("big:"+big);
		System.out.println("small:"+small);
	}
}
