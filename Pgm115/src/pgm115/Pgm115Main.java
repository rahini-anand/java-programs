package pgm115;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Pgm115Main {
	public static void main(String args[]) {
		int x=0;
		
		Vector v=new Vector();
		
		FileInputStream f1=null;
		FileInputStream f2=null;
		FileInputStream f3=null;
		SequenceInputStream sis=null;
		
		try {
			v.add(f1=new FileInputStream("Test"));
			v.add(f1=new FileInputStream("FlipTest"));
			v.add(f1=new FileInputStream("CopyTest"));
			
			Enumeration e=v.elements();
			
			sis=new SequenceInputStream(e);
			
			x=sis.read();
			while(x!=-1) {
				char y=(char) x;
				System.out.print(y);
				x=sis.read();
			}
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
