package pgm119;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Pgm119Main {
	public static void main(String args[]) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		String s=" ";
		
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			s=br.readLine();
			System.out.print(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
