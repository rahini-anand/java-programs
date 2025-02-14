package pgm116;

import java.io.*;

public class Pgm116Main {
	public static void main(String args[]) {
		InputStreamReader isr=null;
	
		try {
			isr=new InputStreamReader(System.in);
			int a=isr.read();
			System.out.println(a);
			System.out.println(isr.getEncoding());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
