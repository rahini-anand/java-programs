package point1;

import a2nos1.A2Nos1;

public class Point1 extends A2Nos1 {
	public Point1() {
		x=10;
		y=20;
	}
	
	public Point1(int a) {
		x=a;
		y=20;
	}
	
	public Point1(int a, int b) {
		x=a;
		y=b;
	}
	
	public Point1(Point1 p) {
		x=p.x;
		y=p.y;
	}
	
	public void moveRight(int dx) {
		x=x+dx;
	}
	public void moveLeft(int dx) {
		x=x-dx;
	}
	public void moveUp(int dy) {
		y=y+dy;
	}
	public void moveDown(int dy) {
		y=y-dy;
	}
	
}
