package pgm121;

import java.io.*;

public class Pgm121Main {
	public static void main(String args[]) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		String s1=" ";
		String s2=" ";
		float f=0;
		
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			s1=br.readLine();
			s2=br.readLine();
			
			float a=Float.parseFloat(s1);
			float b=Float.parseFloat(s2);
			
			f=a*b;
			System.out.println(f);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
