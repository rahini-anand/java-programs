package op2nosExt;

public class Pgm49Main {
	public static void main(String args[]){
		
		Op2nosExt a,a1;
		a=new Op2nosExt();
		a1=new Op2nosExt(200,500);
		
		int x=a.sum();
		int y=a1.sum();
		
		System.out.println("SumA:"+x);
		System.out.println("SumA1:"+y);
	}
}
