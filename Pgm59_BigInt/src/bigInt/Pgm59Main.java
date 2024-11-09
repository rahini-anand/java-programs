package bigInt;

public class Pgm59Main {
	public static void main(String args[]) {
		BigInt res=(a,b,c)-> a>b?(a>c?a:c):(b>c?b:c);
		
		int b=res.find(10, 40, 30);
		
		System.out.println("Big:"+b);
	}
}
