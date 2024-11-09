package shape;

public class Pgm54Main {
	public static void main(String args[]) {
		Shape a=new Shape();
		
		Shape.Circle x= a.new Circle();
		Shape.Rectangle y=a.new Rectangle();
		
		x.Area();
		x.Circumstance();
		x.display();
		
		y.Area();
		y.Circumstance();
		y.display();
	}
}
