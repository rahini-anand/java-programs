package mydata;

public class Pgm123Main {
	public static void main(String args[]) {
		MyPrimitiveData m=new MyPrimitiveData();
		
		int i=m.readInt();
		float f=m.readFloat();
		double d=m.readDouble();
		long l=m.readLong();
		boolean b=m.readBooelan();
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(b);
	}

}
