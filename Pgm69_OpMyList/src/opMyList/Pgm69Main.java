package opMyList;

public class Pgm69Main {
	public static void main(String args[]) {
		OpMyList m,m1;
		
		m=new OpMyList();
		m1=new OpMyList(10);
		
		m.display();
		System.out.println("_____________");
		m1.display();
		System.out.println("_____________");
		
		int s=m1.sum();
		System.out.println("Sum:"+s);
		int b=m1.big();
		System.out.println("Big:"+b);
		int sm=m1.small();
		System.out.println("Small:"+sm);
		boolean f=m1.find(6);
		System.out.println("find:"+f);
		int ind=m1.Index(5);
		System.out.println("Index:"+ind);
		m1.remove(7);
		m1.display();
	}

}
