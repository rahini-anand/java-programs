package pgm17_point_ex;

import a2nos.A2Nos;

public class Point_ex extends A2Nos {

	public Point_ex() {
		super();
	}

	public Point_ex(int a) {
		super(a);
	}

	public Point_ex(int a, int b) {
		super(a, b);
	}

	public Point_ex(Point_ex p) {
		super(p);
	}

	public void MoveRight(int dx) {
		int x = getx();
		int y = gety();

		x = x + dx;
		set(x, y);
	}

	public void MoveLeft(int dx) {
		int x = getx();
		int y = gety();

		x = x - dx;
		set(x, y);
	}

	public void MoveUp(int dy) {
		int x = getx();
		int y = gety();

		y = y + dy;
		set(x, y);
	}

	public void MoveDown(int dy) {
		int x = getx();
		int y = gety();

		y = y - dy;
		set(x, y);
	}

}
