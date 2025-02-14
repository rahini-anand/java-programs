package pgm114;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Pgm114Main {
	public static void main(String args[]) {
		int x=0;
		
		FileInputStream f1=null;
		FileInputStream f2=null;
		FileInputStream f3=null;
		SequenceInputStream sis=null;
		
		try {
			f1=new FileInputStream("Test");
			f2=new FileInputStream("FlipTest");
			
			sis=new SequenceInputStream(f1,f2);
			
			x=sis.read();
			while(x!=-1) {
				char y=(char) x;
				System.out.print(y);
				x=sis.read();
				
			}
			f1.close();
			f2.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
