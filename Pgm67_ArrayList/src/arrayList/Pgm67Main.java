

java.util.ArrayList;


public class Pgm67Main {

	public static void main(String[] args) {
		ArrayList<Integer> al;
		al=new ArrayList<Integer>();
		
		int n=10;
		for (int i=0;i<n;i++) {
			al.add((int)(Math.random()*100));
		}
	}

}
