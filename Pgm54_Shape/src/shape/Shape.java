package shape;

public class Shape {

	private float r,l,b,area,circum;
	
	public class Circle{
		public Circle() {
			r=3.5f;
		}
		
		public void Area() {
			area=3.14f*r*r;
		}
		public void Circumstance() {
			circum=2*3.14f*r;
		}
		
		public void display() {
			System.out.println("AreaCircle:"+area);
			System.out.println("CircumstanceCircle:"+circum);
		}
		
	}
	
	public class Rectangle{
		public Rectangle() {
			l=3.1f;
			b=2.2f;
		}
		
		public void Area() {
			area=l*b;
		}
		public void Circumstance() {
			circum=2*(l+b);
		}
		
		public void display() {
			System.out.println("AreaRectangle:"+area);
			System.out.println("CircumstanceRectangle:"+circum);
		}
		
	}
}
