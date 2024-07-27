package matrix;

public class Main {

	public static void main(String args[]) {
		Matrix m,m1,m2;
		
		m=new Matrix();
		m1=new Matrix(3,4);
		m2=new Matrix(3,3);
		
		m.display();
		m1.display();
		m2.display();
		
		m.displayEach();
		m1.displayEach();
		m2.displayEach();
	}
}
