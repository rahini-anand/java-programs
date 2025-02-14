package pgm122;

import java.io.*;

public class Pgm122Main {
	public static void main(String args[]) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		String s1=" ";
		String s2=" ";
		String s3=" ";
		int big=0;
		
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			s1=br.readLine();
			s2=br.readLine();
			s3=br.readLine();
			
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=Integer.parseInt(s3);
			
			big=a>b?(a>c?a:c):(b>c?b:c);
			
			System.out.println(big);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
