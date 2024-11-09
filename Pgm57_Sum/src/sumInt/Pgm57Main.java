package sumInt;

public class Pgm57Main {
	public static void main(String args[]) {
		SumInt res=(a,b)-> a+b;
			
		int s=res.find(10,15);
		
		System.out.println("Sum:"+s);
	}
}
