package pgm118;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Pgm118Main {
	public static void main(String args[]) {
		String [] s=new String[3];
		int x=0;
		FileInputStream f=null;
		SequenceInputStream sis=null;
		
		s[0]="Test";
		s[1]="FlipTest";
		s[2]="CopyTest";
		
		Vector v=new Vector();
		
		try {
			for(int i=0;i<3;i++) {
				v.add(new FileInputStream(s[i]));
			}
			
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
