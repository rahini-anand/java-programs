package pgm17_point_ex;

public class Main {
	public static void main(String args[]) {
		Point_ex p, p1, p2, p3;

		p = new Point_ex();
		p1 = new Point_ex(100);
		p2 = new Point_ex(400, 800);
		p3 = new Point_ex(p1);

		p.display();
		p1.display();
		p2.display();
		p3.display();

		p.MoveRight(15);
		p.display();

		p.MoveLeft(50);
		p.display();

		p.MoveUp(100);
		p.display();

		p.MoveDown(200);
		p.display();

	}
}
