package myList;

public class Pgm68Main {
	public static void main(String args[]) {
		MyList m=new MyList();
		MyList m1=new MyList(10);
		
		m.display();
		System.out.println("---------");
		m1.display();
		System.out.println("---------");
		//m1.dispEach();
		System.out.println("---------");
		//m1.dispInd();
		System.out.println("---------");
		//m1.dispIter();
		System.out.println("---------");
		m1.dispIterRev();
		System.out.println("---------");
		m1.IndexOfElement();
		
		
		
	}
}
