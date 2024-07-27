package point;

public class Main {

	public static void main(String[] args) {

		Point p;

		p = new Point();
		p.display();

		p.set(100);
		p.display();

		p.set(1000, 2000);
		p.display();

		p.reset();
		p.display();

		int x = p.getx();
		int y = p.gety();
		Point p1 = (Point) p.getobj();

		System.out.println("x:" + x);
		System.out.println("y:" + y);
		p1.display();
	}
}
