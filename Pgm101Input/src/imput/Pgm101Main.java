package imput;

import java.io.IOException;

public class Pgm101Main {
	public static void main(String args[]) {
		int x=0;
		try {
			x=System.in.read();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(x);
	}

}
