package pgm117;

import java.io.*;

public class Pgm117Main {
	public static void main(String args[]) {
		char [] c=new char[100];
		int offset=0;
		int len=8;
		InputStreamReader isr=null;
		
		try {
			isr=new InputStreamReader(System.in);
			int x=isr.read(c,offset,len);
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
