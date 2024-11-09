import java.util.ArrayList;

public class Pgm67Main {

	public static void main(String[] args) {
			ArrayList <Integer> al;
			al=new ArrayList <Integer>();
			
			int n=10;
			for (int i=0;i<n;i++) {
				int a=(int)(Math.random()*100);
				al.add(a);
			}
			
			System.out.println(al);

	}

}
