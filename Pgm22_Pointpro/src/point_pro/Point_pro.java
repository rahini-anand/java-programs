package point_pro;

import a2nos_pro.A2Nos_pro;
public class Point_pro extends A2Nos_pro {
	
	public Point_pro() {
		x=10;
		y=20;
	}
	
	public Point_pro(int a) {
		x=a;
		y=20;
	}
	
	public Point_pro(int a, int b) {
		x=a;
		y=b;
	}
	
	public Point_pro(Point_pro p) {
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
