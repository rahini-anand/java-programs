package areaInt;

public class Pgm58Main {
	public static void main(String args[]) {
		
		float pi=3.14f;
		AreaInt res=(r)->pi*r*r;
		
		float a=res.find(2.5f);
		
		System.out.println(a);
	}
}
