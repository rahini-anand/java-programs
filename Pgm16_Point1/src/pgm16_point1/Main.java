package pgm16_point1;

public class Main {
	public static void main(String args[]) {
		Point1 p, p1, p2, p3;

		p = new Point1();
		p1 = new Point1(400);
		p2 = new Point1(500, 600);
		p3 = new Point1(p1);

		p.display();
		p1.display();
		p2.display();
		p3.display();

		p.set(500);
		p.display();

		p.set(5000, 1000);
		p.display();

		p.reset();
		p.display();

		int x = p.getx();
		int y = p.gety();
		Point1 p4 = (Point1) p1.getobj();

		System.out.println(x);
		System.out.println(y);

		p4.display();
	}

}
