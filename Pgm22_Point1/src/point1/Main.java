package point1;

public class Main {
	public static void main(String args[]) {
		Point1 p;
		
		p=new Point1();
		p.display();
		
		p.moveRight(55);
		p.display();
		
		p.moveLeft(30);
		p.display();
		
		p.moveUp(25);
		p.display();
		
		p.moveDown(15);
		p.display();
	}
}
