package pgm120;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Pgm120Main {
	public static void main(String args[]) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		String s1=" ";
		String s2=" ";
		int x=0;
		
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			s1=br.readLine();
			s2=br.readLine();
			
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			
			x=a+b;
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
