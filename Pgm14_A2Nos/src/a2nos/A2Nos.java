package a2nos;

public class A2Nos {
	private int x, y;

	public A2Nos() {
		x = 10;
		y = 20;
	}

	public A2Nos(int a) {
		x = a;
		y = 20;

	}

	public A2Nos(int a, int b) {
		x = a;
		y = b;
	}

	public A2Nos(A2Nos a) {
		x = a.x;
		y = a.y;
	}

	public void set(int x) {
		this.x = x;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void set(A2Nos a) {
		this.x = a.x;
		this.y = a.y;
	}

	public void reset() {
		x = 10;
		y = 20;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	public A2Nos getobj() {
		return this;
	}

	public void display() {
		System.out.printf("x:%d\n", x);
		System.out.printf("y:%d\n", y);

	}
}
