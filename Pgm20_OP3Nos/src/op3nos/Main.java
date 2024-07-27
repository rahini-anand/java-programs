package op3nos;

public class Main {
	public static void main(String args[]) {
		OP3Nos op,op1,op2,op3,op4;
		
		op=new OP3Nos();
		op1=new OP3Nos(100);
		op2=new OP3Nos(800,400);
		op3=new OP3Nos(1,2,3);
		op4=new OP3Nos(op1);
		
		op.display_all();
		op1.display_all();
		op2.display_all();
		op3.display_all();
		op4.display_all();
		
		int s=op2.sum();
		int p=op3.product();
		int big=op2.big_three();
		int small=op2.small_three();
		
		System.out.println("sum:"+s);
		System.out.println("product:"+p);
		System.out.println("big:"+big);
		System.out.println("small:"+small);
		
		
	}
}
