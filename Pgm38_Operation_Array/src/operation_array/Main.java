package operation_array;

public class Main {
	public static void main(String args[]) {
		
		Operation_Array a=new Operation_Array(10);
		
		a.display();
		
		int s=a.sum();
		System.out.println("sum:"+s);
		
		int b=a.big();
		System.out.println("big:"+b);
		
		int sma=a.small();
		System.out.println("Small:"+sma);
		
		boolean f=a.find_presense(500);
		System.out.println("Find:"+f);
		
		int i=a.index(28);
		System.out.println("Index:"+i);
		
	}

}
